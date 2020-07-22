from flask import Flask, jsonify,request
app=Flask(__name__)


import toTransformator as toTransformator

@app.route('/') #Main Route
def run():
    content = request.get_json() 
    model = content["model"]
    model = toTransformator.send(model)
    content["model"] = model["body"]
    return content
   

if (__name__ == "__main__"):
    app.run(debug=True, port=8042)