#CAPEC to TRADES conversion
#By Avi Shaked

import xml.etree.ElementTree as ET
import xml.dom.minidom

# Load the input XML from file
tree = ET.parse('capec.xml')
root = tree.getroot()

# Find the <Attack_Patterns> element
attack_patterns = root.find('.//{http://capec.mitre.org/capec-3}Attack_Patterns')

# Create the output XML structure
output_root = ET.Element('TRADES:Catalog', attrib={'xmi:version': '2.0', 'xmlns:xmi': 'http://www.omg.org/XMI', 'xmlns:TRADES': 'dsm.TRADES', 'name': 'Capec', 'id': 'Capec'})
threat_owner = ET.SubElement(output_root, 'threatOwner')

# Iterate over Attack_Patterns and create external elements under the threatOwner
for attack_pattern in attack_patterns.findall('{http://capec.mitre.org/capec-3}Attack_Pattern'):
    print(attack_pattern.attrib['Name']+attack_pattern.attrib['ID'])
    external = ET.SubElement(threat_owner, 'externals')
    external.attrib['name'] = attack_pattern.attrib['Name']
    external.attrib['id'] = 'Capec_' + attack_pattern.attrib['ID']
    
    # Concatenate all paragraphs within Description or Extended_Description
    description = ""
    for desc in attack_pattern.findall('.//{http://capec.mitre.org/capec-3}Description/{http://www.w3.org/1999/xhtml}p'):
        description += desc.text.strip() + "\n"
    for desc in attack_pattern.findall('.//{http://capec.mitre.org/capec-3}Extended_Description/{http://www.w3.org/1999/xhtml}p'):
        description += desc.text.strip() + "\n"    
    # Add the concatenated description to the external element
    external.attrib['description'] = description.strip()
    
    external.attrib['source'] = 'Capec'
    external.attrib['link'] = 'https://capec.mitre.org/data/definitions/' + attack_pattern.attrib['ID'] + '.html'
    external.attrib['sourceID'] = 'Capec'

# Convert the XML structure to a string with pretty printing
xml_str = ET.tostring(output_root, encoding='ASCII')
dom = xml.dom.minidom.parseString(xml_str)
pretty_xml_str = dom.toprettyxml()

#remove first line
pretty_xml_str = '\n'.join([line for line in pretty_xml_str.split('\n') if not line.strip().startswith('<?xml')])

# Add the XML header
output_xml = '<?xml version="1.0" encoding="ASCII"?>\n' + pretty_xml_str

# Write the output XML to a file
with open('capec.trades', 'w') as f:
    f.write(output_xml)

print("Output written to capec.trades file.")
