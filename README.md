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

Los servicios, fueron desarollados en distintos lenguajes y cada uno posee un puerto asociado.

- ManagerServices:
  + Port:8022
  + Python3
- EnginerServices:
  + Port:8023
  + Java 11
  + MongoDB:27018
