docker run -it --rm \
--name="manager" \
--env-file=".env" \
-p 8022:8022 \
--network tthong \
--ip 192.168.32.10 \
-d \
manager
