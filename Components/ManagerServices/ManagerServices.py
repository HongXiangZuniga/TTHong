from flask import Flask,request
app = Flask(__name__)


@app.route('/')
def hello():
    try:
        content = request.get_json()

        #Caso donde Inicial
        if(len(content)==0):
            return "Te mandare a iniciar"
        else:
            return "Entrando al proceso"



    except expression as identifier:
        return "Hello World!"



if __name__ == '__main__':
     app.run(debug=True, port=8022)
