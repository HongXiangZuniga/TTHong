import os

def links():
    dict={}
    agregar={"EngineNext":os.getenv("ENGINE_NEXT")}
    dict.update(agregar)
    agregar={"EngineInit":os.getenv("ENGINE_INIT")}
    dict.update(agregar)
    agregar={"EngineServices":os.getenv("ENGINE_SERVICES")}
    dict.update(agregar)
    agregar={"IStarValidated":os.getenv("ISTAR_VALIDATOR_SERVICES")}
    dict.update(agregar)
    agregar={"IStar2AC":os.getenv("ISTAR_2_AC")}
    dict.update(agregar)
    agregar={"ACValidated":os.getenv("ACVALIDATER_SERVICES")}
    dict.update(agregar)
    agregar={"ACValidated":os.getenv("AC_2_OOM")}
    dict.update(agregar)
    agregar={"OOMValidated":os.getenv("OOM_VALIDATER_SERVICES")}
    dict.update(agregar)
    agregar={"Finish":"Finish"}
    dict.update(agregar)
    print(dict)
    return dict


"""def links():
    dict ={}
    archivo = open("Links","r")
    for linea in archivo.readlines():
        elementos = linea[:len(linea)-1].split("-")
        agregar = {elementos[0]:elementos[1]}
        dict.update(agregar)
    archivo.close
    return dict"""

