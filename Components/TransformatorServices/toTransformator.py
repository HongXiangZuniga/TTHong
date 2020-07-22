import requests as rq
def send(data):

    content = {"model":data}
    send = rq.get('https://ruvc1jcbe9.execute-api.sa-east-1.amazonaws.com/test/validator_test',json=content)
    return(send.json())