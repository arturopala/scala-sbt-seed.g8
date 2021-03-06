#!/usr/bin/env bash

if [[ -f ./build.sbt ]] && [[ -d ./src/main/g8 ]]; then

    export TEMPLATE=`pwd | xargs basename`
    echo ${TEMPLATE}
    mkdir -p target/sandbox
    cd target/sandbox
    sudo rm -r seed-test
    g8 file://../../../${TEMPLATE} --projectName="Seed Test" --userName="Artur Opala" --package="com.github.arturopala.seedtest" -o seed-test "$@"
    cd seed-test
    git init
	git add .
	git commit -m start
    sbt test

else

    echo "WARNING: run the script ./test.sh in the template root folder"
    exit -1

fi