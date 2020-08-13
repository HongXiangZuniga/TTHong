import requests

from Ubications import links
from Worker import work



def Init(content):
    ubications = links()
    url = ubications["EngineInit"]
    send = requests.get(url,json=content)
    return send.json()

def NextStep(content):
    ubications = links()
    url = ubications["EngineServices"]
    send = requests.get(url,json=content)
    NextStep = send.json()
    return NextStep["next"]

def Go(content,NextStep):
    ubications = links()
    Worker = work("NextStep")
    if(Worker !="Finish"):
        url = ubications[Worker]
        send = requests.get(url,json=content)
        return send.json()
    else:
        return content
