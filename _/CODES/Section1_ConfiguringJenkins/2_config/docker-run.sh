#!/usr/bin/env bash

# Starts all applications. Run 'mvn docker:build' in platform and webapp before this script to create docker images.

# Remove existing containers
docker stop jenkins_server
docker rm jenkins_server
docker-compose down --rmi all
rm -rf docker/container/*

## Start new containers

docker-compose up --build
