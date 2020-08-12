from flask import Flask,request
app = Flask(__name__)

import GoTo

@app.route('/')
def main():

    content = request.get_json()
    #Caso donde Inicial
    if(len(content)==0):
        return (GoTo.run(content,"EngineInit"))
    while(GoTo.run(content,"EngineServices")["next"]!="Finish"):
        print(GoTo.run(content,"EngineServices"))
        next = (GoTo.run(content,"EngineServices"))
        link = next["next"]
        content = (GoTo.run(content,link))
    return content
           




if __name__ == '__main__':
     app.run(debug=True, port=8022)
