from flask import Flask, jsonify,request
app=Flask(__name__)

import Validator as validator

@app.route('/') #Main Route
def main():
    content = request.get_json()
    result = validator.run(content)
    if(result == True):
        content['state']="validator"
        return content
    else:
        return "error"


@app.route('/ping') #Route of test
def ping():
    return jsonify({"message":"pong"})#Return json to client test

if (__name__ == "__main__"):
    app.run(debug=True, port=8032)