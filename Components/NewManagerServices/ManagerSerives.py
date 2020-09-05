from flask import Flask,request
app = Flask(__name__)

import Go 
import Planner 

@app.route('/')
def main():
    content = request.get_json()
    if(len(content)==0):
        content = Go.To("EngineServicesInit",content)
        return content
    NextStep = Planner.NextSetp(content)
    content = Go.To(NextStep,content)
    return  content
    #Caso donde Inicial



if __name__ == '__main__':
     app.run(debug=True, port=8022)
