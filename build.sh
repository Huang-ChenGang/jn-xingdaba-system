#!/usr/bin/env bash

gradle clean -x test build

docker build --no-cache -t xingdaba/xingdaba-system .

docker tag xingdaba/xingdaba-system hub.c.163.com/riyuexingchenace/xingdaba/xingdaba-system:latest

docker push hub.c.163.com/riyuexingchenace/xingdaba/xingdaba-system:latest
