import requests as rq
def send(data):
    send = rq.get('https://3sztqsjm57.execute-api.us-east-2.amazonaws.com/default/transformador',json=data)#Aqui estaria la conexion si funcionara
    json = send.text
    print(json)