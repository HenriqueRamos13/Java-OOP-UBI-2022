#!/bin/bash
javadoc -d doc Packages/*/*.java;

cd Doc
npx http-server