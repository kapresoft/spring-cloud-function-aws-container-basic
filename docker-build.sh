#!/usr/bin/env zsh

function _dockerBuildProject() {
  local module="spring-cloud-function-aws-container-basic"
  local cmd="docker build -t ${module} ."
  echo "Executing: ${cmd}"
  eval "${cmd}"
}
./mvnw package -Pskip-checks && _dockerBuildProject
