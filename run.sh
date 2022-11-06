#!/bin/bash
rm -rf */**/*.class;
rm -rf Packages/Main.class;
javac Packages/Main.java Packages/*/*.java;

cd Packages
java Main