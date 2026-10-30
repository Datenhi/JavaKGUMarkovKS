rm -rf out
rm -rf sources.txt
find  -type f -name "*.java" > sources.txt
javac -d ./out/ @sources.txt
java -cp out Main