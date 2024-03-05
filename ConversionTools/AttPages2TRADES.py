# convert Mitre ATT&CK pages to TRADES #
from bs4 import BeautifulSoup
import xml.etree.ElementTree as ET
import os
import glob

def indent(elem, level=0):
    i = "\n" + level * "  "
    if len(elem):
        if not elem.text or not elem.text.strip():
            elem.text = i + "  "
        if not elem.tail or not elem.tail.strip():
            elem.tail = i
        for elem in elem:
            indent(elem, level + 1)
        if not elem.tail or not elem.tail.strip():
            elem.tail = i
    else:
        if level and (not elem.tail or not elem.tail.strip()):
            elem.tail = i

# Create root
outputRoot = ET.Element('TRADES:Catalog')
outputRoot.set('xmi:version', '2.0')
outputRoot.set('xmlns:xmi', 'http://www.omg.org/XMI')
outputRoot.set('xmlns:TRADES', 'dsm.TRADES')
outputRoot.set('name', 'MITRE-ATTACK-Enterprise')
outputRoot.set('id', 'MITRE-ATT&CK-Enterprise')
threatOwner = ET.SubElement(outputRoot, 'threatOwner')

folder_path = "C:\\temp\\Mitre"

# Constants
threatSRC = "ATTACK"  # The source of the data from the threat ID
linkThreatPrefix = "https://attack.mitre.org/techniques/"
linkMitigationPrefix = "https://attack.mitre.org/mitigations/"

# Variables
threatsList = []
mitigationList = []
controlNum = 0

for fileName in glob.glob(os.path.join(folder_path, '*.attck')):
    with open(fileName, 'r', encoding='UTF8') as myFile:
        html_content = myFile.read()
        print(fileName)

        # ---------------------- threat tag ------------------- #
        # Create new threat tag
        threatTag = ET.SubElement(threatOwner, 'externals')

        html = BeautifulSoup(html_content, "html.parser")

        # Get the threat name from file
        h1_tag = html.find('h1')
        if h1_tag:
            threatName = h1_tag.text.strip()
        else:
            print("No <h1> element found in the HTML document.")
            continue  # Skip to the next file

        # Create list of threats
        threatsList.append(threatName)

        # Set the name to the tag
        #DEBUG threatTag.set('xsi:type', 'extTRADES:extThreat')
        threatTag.set('name', threatName)

        # Set the source of the threat
        threatTag.set('source', threatSRC)

        # Get the threat card
        divs = html.body.findAll('div', attrs={'class': 'card-data'})

        # Run over the threat card
        for div in divs:
            # Get the current attribute
            wordList = div.text.split()  # Create list of words
            attribute = wordList[0]

            # If the current attribute is threat ID
            if attribute == 'ID:':
                # Generate the ID attribute
                tradesThreatID = threatSRC + '_' + wordList[-1]  # Get the last word aka ID and
                threatTag.set('ID', tradesThreatID)  # Set it as an ID attribute

                # Generate the threat link from the threat ID and add it to the link
                threatLink = linkThreatPrefix + wordList[-1]
                threatTag.set('link', threatLink)

            # If the current attribute is platform
            if attribute == 'Platform:':
                # Generate the threat Applicability
                threatTag.set('Applicability', div.text.split(':', 1)[1].strip())

tree = ET.ElementTree(outputRoot)
indent(outputRoot)
tree.write("C:\\Temp\\Mitre\\ATTCK.trades", encoding="utf-8", xml_declaration=True)
