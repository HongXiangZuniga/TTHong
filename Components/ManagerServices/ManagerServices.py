from flask import Flask,request
app = Flask(__name__)

import GoTo

@app.route('/')
def hello():
    check = True
    try:
        content = request.get_json()
        #Caso donde Inicial
        if(len(content)==0):
            return (GoTo.run(content,"EngineInit"))
        while(GoTo.run(content,"EngineServices")!="Finish" or content.get("IModel").get("validator").size !=0 or content.get("ACModel").get("validator").size !=0 or content.get("OOMModel").get("validator").size !=0):
            next = (GoTo.run(content,"EngineServices"))
            link = next["next"]
            print("Go To: " + str(link))
            content = (GoTo.run(content,link))
            return content
           
    except Exception as e:
        return str(e)



if __name__ == '__main__':
     app.run(debug=True, port=8022)
