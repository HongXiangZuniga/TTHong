from flask import Flask, jsonify,request
app=Flask(__name__)

import Validator as validator

@app.route('/') #Main Route
def main():
    content = request.get_json()
    print(content)
    content = validator.run(content)
    print(content)
    return content

 

@app.route('/ping') #Route of test
def ping():
    return jsonify({"message":"pong"})#Return json to client test

if (__name__ == "__main__"):
    app.run(debug=True, port=8032)