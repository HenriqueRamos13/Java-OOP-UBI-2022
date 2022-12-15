#!/bin/bash
rm -rf */**/*.class;
rm -rf Packages/Main.class;
javac Packages/Main.java Packages/*/*.java;
# -Xlint:unchecked;

cd Packages
java Main