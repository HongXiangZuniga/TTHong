from flask import Flask, jsonify,request
app=Flask(__name__)

import toTransformator as toTransformator

@app.route('/') #Main Route
def main():
    content = request.get_json() 
    print(toTransformator.send(content))
    return toTransformator.send(content)
   

if (__name__ == "__main__"):
    app.run(debug=True, port=8042)