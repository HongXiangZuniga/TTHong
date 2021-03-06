build:
	sh Components/ManagerServices/build.sh

run:
	@echo "*** Create network***"
	@echo "*** Runs images ***"
	docker network create --driver bridge tthong --subnet=192.168.32.0/24 --ip-range=192.168.32.128/25  --gateway=192.168.32.1
	docker run --network tthong --ip 192.168.32.2 -d -p 8020:8020 gateway
	sh Components/EngineServices/run.sh
	sh Components/IValidatorServices/run.sh
	docker run --network tthong --ip 192.168.32.5 -d -p 8025:8025 i2ac
	docker run --network tthong --ip 192.168.32.6 -d -p 8026:8026 acvalidator
	docker run --network tthong --ip 192.168.32.7 -d -p 8027:8027 ac2oom
	docker run --network tthong --ip 192.168.32.8 -d -p 8028:8028 oomvalidtor
	sh Components/ManagerServices/run.sh
