docker run -it --rm \
--name="engineservices" \
--env-file=".env" \
-p 8023:8023 \
--network tthong \
--ip 192.168.2.3 \
-d \
engineservices