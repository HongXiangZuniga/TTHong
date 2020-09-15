from flask import Flask,request
app = Flask(__name__)


@app.route('/')
def main():
    content = request.get_json()
    if(len(content)==0):
        return content
    return "hola mundo"



if __name__ == '__main__':
     app.run(debug=True, port=8025)
