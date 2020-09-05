from flask import Flask,request
app = Flask(__name__)



@app.route('/')
def main():
    try:
        content = request.get_json()
        if(len(content.get("IModel").get("validator"))!=0):
            content.get("IModel").get("validator")[0] = "SecretKey"
        else:
            content.get("IModel").get("validator").append("SecretKey")
        return content
        print("Ok")
    
    except Exception as e:
        print("error: ",str(e))
        return str(e)
    


if __name__ == '__main__':
     app.run(debug=True, port=8024)
