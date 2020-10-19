import requests
import json

def to(content,ubication):
    send = requests.get(ubication,json=content)
    js = json.loads(send.text)
    return js

