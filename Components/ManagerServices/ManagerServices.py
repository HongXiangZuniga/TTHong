from flask import Flask, jsonify,request
import json as json
from collections import OrderedDict

app=Flask(__name__)

import toEngineServices as toEngineServices
import toEngineServicesVanila as toEngineServicesVanila
import toValidatorServices as toValidatorServices
import toTransformator as toTransformator

@app.route('/') #Main Route
def main():
    content = request.get_json() #Return type dict https://docs.python.org/3/tutorial/datastructures.html
    if(content.get("id")==None): #Return type dict https://docs.python.org/3/tutorial/datastructures.html
        result = toEngineServicesVanila.send(content)
        result.pop("pointAcess")
        result = '{'+'"id":'+'"'+result["id"]+'"'+','+'"model":{'+result["model"][1:len(result["model"])-1]+'}'+','+'"errors":{'+result["errors"][1:len(result["errors"])-1]+'}'+'}'
        result = result.replace("'",'"')
        return json.loads(result,object_pairs_hook=OrderedDict)
    else:
        result = toEngineServices.send(content)
        error = result.get("error")
        nextstep = result.get("next")


        if(error!=None):
            return error
        if(nextstep=="validator"):
            print("Entrado al validador")
            response = toValidatorServices.send(content)
            check = response.get("errors").get("check")
            content["errors"] = response["errors"]
            if(check!="true"):
                return response.get("errors")
            else:
                result = toEngineServices.send(response)



        result = toEngineServices.send(content)
        error = result.get("error")
        nextstep = result.get("next")
        if(nextstep=="transformator"):
            content = toTransformator.send(content)
        


        result = toEngineServices.send(content)
        error = result.get("error")
        nextstep = result.get("next")
        if(nextstep=="finish"):
            fin = {"status":"finish"}
            content.update(fin)
        return content

if (__name__ == "__main__"):
    app.run(debug=True, port=8022)