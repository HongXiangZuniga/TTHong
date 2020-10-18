import requests
import json
from flask import request
from Ubications import links
import Go

def next(content):
    Links = links()
    url = Links["EngineNext"]
    send = Go.to(content,url)
    
    return send.get("next")
