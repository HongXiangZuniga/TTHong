from flask import Flask,request
app = Flask(__name__)


@app.route('/')
def main():
    secretkey="abc"
    content = request.get_json()
    content['model_AC']['validator'].append(secretkey)
    return (content)



if __name__ == '__main__':
    app.run(host='0.0.0.0',port=8026)
