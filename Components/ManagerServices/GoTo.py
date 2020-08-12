
import Ubications 
import requests


def run(content,ubication):
    links = Ubications.links();
    if(ubication != "Finish"):
        url = links[ubication]
        send = requests.get(url,json=content)
        return send.json()
    else:
        return content
    
    


