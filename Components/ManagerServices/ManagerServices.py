from flask import Flask,request
app = Flask(__name__)

import GoTo

@app.route('/')
def hello():
    try:
        content = request.get_json()
        #Caso donde Inicial
        if(len(content)==0):
            return (GoTo.run(content,"EngineInit"))
        next = GoTo.run(content,"EngineServices")
        return next

    except Exception as e:
        return str(e)



if __name__ == '__main__':
     app.run(debug=True, port=8022)
