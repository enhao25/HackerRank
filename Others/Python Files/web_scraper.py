import requests
from bs4 import BeautifulSoup

r = requests.get("https://scrapethissite.com/pages/")
print (r.status_code == requests.codes.ok)

soup = BeautifulSoup(r.text, "html.parser")
print (soup.find("h3", "page-title").text)
