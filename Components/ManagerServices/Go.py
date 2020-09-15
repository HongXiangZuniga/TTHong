import Ubications 
import requests


def To(nextstep,content):
    links = Ubications.links()
    if(nextstep=="EngineServicesInit"):
        url = links["EngineServicesInit"]
        send = requests.get(url,json=content)
        return send.json()
    url =links[nextstep["next"]]
    send = requests.get(url,json=content)
    return send.json()