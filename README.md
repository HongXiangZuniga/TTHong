# Trabajo de Titulo

Este repositorio en su version actual, presenta una arquitectura basada en microservicios, que en su conjunto permite la transformacion y validacion de modelos conceptuales. Estos modelos son enviados bajo formato JSON, y se maneja envia un JSON y se envia la siguiente tapa en base a la siguiente lista de estados:

# Estados

- Vanilla
- IValidated
- IStar2AC
- ACValidated
- AC2OOM
- OOMValidated
- Finish

# Servicios/Componentes

Los servicios, fueron desarollados en distintos lenguajes y cada uno posee un puerto asociado para un dominio, estos son configurables en el ENV y utilizados por el Manager.

- ManagerServices:
  + Port: 8022
  + Python 3
- EnginerServices:
  + Port:8023
  + Java 11
  + MongoDB: 27018
- IValidatorServices:
  + Port: 8024
  + Java 11
- IStar2ACServices:
  + Port: 8026
  + Java 11
- ACValidatorServices:
  + Port: 8027
  + Esqueleto Python 3
- AC2OOServices:
  + Port: 8028
  + Esqueleto Python 3
- OOMValidatorServices:
  + Port: 8029
  + Esqueleto Python 3
  
# Formato

Para inicializar debe enviar al ManagerServices un JSON con la siguiente caracteristicas:

```json
{}
```
Y recibira un proyecto vanilla:

```json
{
    "model_AC": {
        "date": "Mon Sep 21 00:12:49 CLST 2020",
        "model": {
            "model": null
        },
        "validator": []
    },
    "model_i": {
        "date": "Mon Sep 21 00:12:49 CLST 2020",
        "model": {
            "actors": [],
            "dependencies": [],
            "links": []
        },
        "validator": []
    },
    "model_OOM": {
        "date": "Mon Sep 21 00:12:49 CLST 2020",
        "model": {
            "model": null
        },
        "validator": []
    },
    "id": "ID del proyecto"
}
```
# Variables de entornos para configurar

+ ENGINE_NEXT= URL
+ ENGINE_INIT= URL
+ ENGINE_SERVICES= URL
+ ISTAR_VALIDATOR_SERVICES= URL
+ ISTAR_2_AC= URL
+ ACVALIDATER_SERVICES= URL
+ AC_2_OOM= URL
+ OOM_VALIDATER_SERVICES= URL
+ SECRET_KEY= Key para comprobar si el elemento esta validado


# Elementos Comunes de los modelos

+ date: Fecha de Creacion del Modelo
+ validator: Un arreglo con los errores asociados a la validacion, si este esta validado recibira una en la pos 0 una SecretKey Que debe ser Acordada en el sistema, por defecto es 'abc'
+ model: Lo asociado a cada modelo.
