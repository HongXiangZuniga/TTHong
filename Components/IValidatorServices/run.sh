docker run -it --rm \
--name="ivalidator" \
--env-file=".env" \
-p 8024:8024 \
--network tthong \
--ip 192.168.2.4 \
-d \
ivalidator