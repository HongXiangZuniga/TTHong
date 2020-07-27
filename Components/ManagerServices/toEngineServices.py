import requests as rq
def send(data):
    url = "http://127.0.0.1:8023/model"
    send = rq.get(url,json=data)
    return(send.json())