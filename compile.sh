#!/bin/bash

BASEDIR=$(dirname "$0")

java -cp .:$BASEDIR/dist/boa-compiler.jar:$BASEDIR/lib/* boa.compiler.BoaCompiler -i /home/ram/Desktop/compiler-git-mix/compiler-local/test/known-good/live-variable-rev3.boa

#java -cp .:$BASEDIR/dist/boa-compiler.jar:$BASEDIR/lib/* boa.compiler.Test
