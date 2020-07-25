import requests
params = {'apikey': '346fdc560458e80eae4e9b65ba67fa212352fb12dd7e0cdbb4185708b42b9367', 'resource':'50ac4fcd3fbc8abcaa766449841b3a0a684b3e217fc40935f1ac22c34c58a9ec'}
headers = {
  "Accept-Encoding": "gzip, deflate",
  "User-Agent" : "gzip,  My Python requests library example client or username"
  }
"""response = requests.post('https://www.virustotal.com/vtapi/v2/file/rescan',
 params=params)
json_response = response.json()
print(json_response)

scan_id = json_response['scan_id']"""

scan_id = "50ac4fcd3fbc8abcaa766449841b3a0a684b3e217fc40935f1ac22c34c58a9ec-1528556813"

response = requests.get('https://www.virustotal.com/vtapi/v2/file/report',
  params=params, headers=headers)
json_response = response.json()
print(json_response['scans']['Symantec'])
