#!/usr/bin/env zsh

function _dockerRunProject() {
  local module="spring-cloud-function-aws-container-basic"
  local cmd="docker run -p 9000:8080 ${module}"
  echo "Executing: ${cmd}"
  eval "${cmd}"
}
./docker-build.sh && _dockerRunProject
