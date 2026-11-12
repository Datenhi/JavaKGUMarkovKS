rm -rf out
rm -rf sources
find -type f -name "*.java" > sources.txt
javac -cp "lib/*" -d out @sources.txt
java -cp out:lib/* Main