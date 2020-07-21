def run(data):
    print("flag")
    if(data.get("errors").get("error")==None):
        data["errors"]["check"]="true"
    return data
   