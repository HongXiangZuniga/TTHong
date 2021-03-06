from flask import Flask,request

#Librerias propias
import Planner as Planner
from Ubications import links
import Go

app = Flask(__name__)

@app.route('/')
def main():
    try:
        content = request.get_json()
        #Caso Inicial
        if(len(content)==0):
            Links = links()
            content = Go.to(content,Links["EngineInit"])
            return content
        #Se pregunta por el siguiente paso
        nextstep = Planner.next(content)
        #print(nextstep)
        if(nextstep =="Finish"):
            return content
        Links = links()
        url=Links[nextstep]
        #Se Actualiza el contenido por el el estado
        if(nextstep=="IStarValidated"):
            aux = Go.to(content,url)
            content["model_i"]["validator"]=aux["validator"]
        elif(nextstep=="IStar2AC"):
            aux = Go.to(content,url)
            content["model_AC"]["model"]=aux
        else:
            content = Go.to(content,url)
        #Se Envia al servidor para que revise el estado si debe actualizar
        #print(content)
        Go.to(content,Links["EngineServices"])
        #Se entrega el contenido
        return content
    except ValueError:
        print(ValueError)
        return ValueError




if __name__ == '__main__':
    app.run(host='0.0.0.0',port=8022)
