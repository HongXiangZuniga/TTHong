#!/bin/bash


docker run -d -p 8020:8020 gateway
docker run -d -p 8022:8022 manager
docker run -d -p 8023:8023 engineservices
docker run -d -p 8024:8024 ivalidator
docker run -d -p 8025:8025 i2ac
docker run -d -p 8026:8026 acvalidator
docker run -d -p 8027:8027 ac2oom
docker run -d -p 8028:8028 oomvalidtor
