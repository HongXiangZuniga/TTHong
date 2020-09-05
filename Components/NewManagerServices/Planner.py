import requests

import Ubications 

def NextSetp(content):
    links = Ubications.links()
    url =links["EngineServices"]
    send = requests.get(url,json=content)
    return send.json()
