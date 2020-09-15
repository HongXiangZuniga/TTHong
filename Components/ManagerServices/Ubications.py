def links():
    dict ={}
    archivo = open("/home/hong/Documentos/TTHong/TTHong/Components/ManagerServices/Links","r")
    for linea in archivo.readlines():
        elementos = linea[:len(linea)-1].split("-")
        agregar = {elementos[0]:elementos[1]}
        dict.update(agregar)
    archivo.close
    return dict