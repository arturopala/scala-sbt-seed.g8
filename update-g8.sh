#!/usr/bin/env bash

if [[ -f ./build.sbt ]] && [[ -d ./src/main/g8 ]]; then

   mkdir -p target
   cd target
   if [[ -d .makeitg8 ]] && [[ -d .makeitg8/.git ]] ; then
        cd .makeitg8
        git pull origin master
   else
        rm -r .makeitg8
        git clone https://github.com/arturopala/make-it-g8.git .makeitg8
        cd .makeitg8
   fi

   sbt "run --noclear --source ../../target/sandbox/seed-test --target ../.. --name scala-seed --package com.github.arturopala.seedtest --description scala-seed  -K projectName=Seed+Test userName=Artur+Opala" 

else

    echo "WARNING: run the script ./update-g8.sh in the template root folder"
    exit -1

fi
