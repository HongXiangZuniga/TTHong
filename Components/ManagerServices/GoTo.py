
import Ubications 
import requests


def run(content,ubication):
    links = Ubications.links();
    url = links[ubication]
    send = requests.get(url,json=content)
    return send.json()
    
    


