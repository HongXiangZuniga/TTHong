import requests as rq
def send(data):
    send = rq.get('https://ruvc1jcbe9.execute-api.sa-east-1.amazonaws.com/test/validator_test',json=data)#Aqui estaria la conexion si funcionara
    return(send.json())