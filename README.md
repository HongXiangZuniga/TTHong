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

# Servicios

Los servicios, fueron desarollados en distintos lenguajes y cada uno posee un puerto asociado para un dominio, estos son configurables en el archivo "Links", en el ManagerServices el cual se encarga de manejar el flujo de trabajo.

- ManagerServices:
  + Port: 8022
  + Python 3
- EnginerServices:
  + Port:8023
  + Java 11
  + MongoDB: 27018
- IValidatorServices:
  + Port: 8024
  + Esqueleto Python 3
- IValidatorServices:
  + Port: 8025
  + Esqueleto Python 3
- IStar2ACServices:
  + Port: 8026
  + Esqueleto Python 3
- ACValidatorServices:
  + Port: 8027
  + Esqueleto Python 3
- AC2OOServices:
  + Port: 8028
  + Esqueleto Python 3
- OOMValidatorServices:
  + Port: 8029
  + Esqueleto Python 3
