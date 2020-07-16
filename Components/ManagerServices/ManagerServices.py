from flask import Flask, jsonify,request
app=Flask(__name__)

import toEngineServices as toEngineServices

@app.route('/') #Main Route
def main():
    content = request.get_json() #Return type dict https://docs.python.org/3/tutorial/datastructures.html
    toEngineServices.send(content)
    return "hola"


@app.route('/ping') #Route of test
def ping():
    return jsonify({"message":"pong"})#Return json to client test

if (__name__ == "__main__"):
    app.run(debug=True, port=8022)