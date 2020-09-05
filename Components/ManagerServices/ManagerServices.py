from flask import Flask,request
app = Flask(__name__)

import Planner as planner

@app.route('/')
def main():
    content = request.get_json()
    #Caso donde Inicial
    if(len(content)==0):
        return (planner.Init(content))
    NextStep = (planner.NextStep(content))
    print(NextStep)
    content = (planner.Go(content,NextStep))
    return content
           




if __name__ == '__main__':
     app.run(debug=True, port=8022)
