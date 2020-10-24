build:
	docker build -f Components/AC2OOM/Dockerfile -t ac2oom .
	docker build -f Components/ACValidatorServices/Dockerfile -t acvalidator .
	docker build -f Components/ApiGateWay/Dockerfile -t gateway .
	docker build -f Components/EngineServices/Dockerfile -t engineservices .
	docker build -f Components/IStar2AC/Dockerfile -t i2ac
	docker build -f Components/IValidatorServices/Dockerfile -t ivalidator
	docker build -f Components/ManagerServices/Dockerfile -t manager
	docker build -f Components/OOMValidatorServices/Dockerfile -t oomvalidtor
	


run:
	docker run -d -p 8020:8020 gateway
	docker run -d -p 8022:8022 manager
	docker run -d -p 8023:8023 engineservices
	docker run -d -p 8024:8024 ivalidator
	docker run -d -p 8025:8025 i2ac
	docker run -d -p 8026:8026 acvalidator
	docker run -d -p 8027:8027 ac2oom
	docker run -d -p 8028:8028 oomvalidtor
