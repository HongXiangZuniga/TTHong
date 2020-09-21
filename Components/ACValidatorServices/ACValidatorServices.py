from flask import Flask,request
app = Flask(__name__)


@app.route('/')
def main():
    secretkey="abc"
    content = request.get_json()
    content['ACModel']['validator'].append(secretkey)
    return (content)



if __name__ == '__main__':
     app.run(debug=True, port=8026)
