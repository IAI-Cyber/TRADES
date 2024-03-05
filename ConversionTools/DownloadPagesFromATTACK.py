# Download MITRE ATT&CK web pages for different techniques and save them locally
import urllib.request
import requests

urlPrefix = 'https://attack.mitre.org/techniques/T'

#Run over all optional site
for attNum in range(1000, 1700): #Range for Techniques

    #Create the url of current index
    currUrl = urlPrefix + str(attNum).zfill(4)
    print(currUrl)

    request = requests.get(currUrl)
    if request.status_code == 200:
        fileName = 'C:\\temp\\Mitre\\T' + str(attNum).zfill(4) + '.attck'
        urllib.request.urlretrieve(currUrl, fileName)

        #print(fileName)
        print('Web site saved')
    else:
        print('Web site for ATT&CK technique ' + str(attNum) + ' does not exist')
