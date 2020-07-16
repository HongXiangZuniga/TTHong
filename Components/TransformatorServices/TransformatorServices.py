from flask import Flask, jsonify,request
app=Flask(__name__)

import toTransformator as toTransformator

@app.route('/') #Main Route
def main():
    content = request.get_json() #Return type dict https://docs.python.org/3/tutorial/datastructures.html
    model = content["model"]
    toTransformator.send(model)
    return "ok"




if (__name__ == "__main__"):
    app.run(debug=True, port=8025)