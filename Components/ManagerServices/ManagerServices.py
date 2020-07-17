from flask import Flask, jsonify,request
app=Flask(__name__)

import toEngineServices as toEngineServices
import toValidatorServices as toValidatorServices
import toTransformator as toTransformator

@app.route('/') #Main Route
def main():
    content = request.get_json() #Return type dict https://docs.python.org/3/tutorial/datastructures.html
    result = toEngineServices.send(content)
    if(result["content"]=="validator"):
        print("flag1")
        content = toValidatorServices.send(content)
        result = toEngineServices.send(content)
    if(result["content"]=="transformated"):
        print("flag2")
        content = toTransformator.send(content)
        result = toEngineServices.send(content)
        print(result)
    if(result["content"]=="finished"):
        return content
    return toEngineServices.send(content)
   


@app.route('/ping') #Route of test
def ping():
    return jsonify({"message":"pong"})#Return json to client test

if (__name__ == "__main__"):
    app.run(debug=True, port=8022)