import requests as rq
def send(data):
    send = rq.get(' http://127.0.0.1:8022/ping',data=data)
    print(send.json())