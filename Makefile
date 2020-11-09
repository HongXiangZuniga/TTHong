run:
	@echo "*** Runs images ***"
	docker run --network tthong --ip 192.168.2.2 -d -p 8020:8020 gateway
	sh Components/EngineServices/run.sh
	sh Components/IValidatorServices/run.sh
	docker run --network tthong --ip 192.168.2.5 -d -p 8025:8025 i2ac
	docker run --network tthong --ip 192.168.2.6 -d -p 8026:8026 acvalidator
	docker run --network tthong --ip 192.168.2.7 -d -p 8027:8027 ac2oom
	docker run --network tthong --ip 192.168.2.8 -d -p 8028:8028 oomvalidtor
	sh Components/ManagerServices/run.sh
