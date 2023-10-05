#!/usr/bin/env bash

./gradlew assemble
cp build/libs/demo-0.1-plain.war docker
docker build -t grailsapp:latest docker
docker run -i --rm -p 8080:8080 grailsapp:latest