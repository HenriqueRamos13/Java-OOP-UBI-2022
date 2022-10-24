rm -rf */**/*.class;
rm -rf Packages/Main.class;
# javadoc -d doc Packages/*/*.java;
javac Packages/Main.java Packages/*/*.java;

cd Packages;
java Main;