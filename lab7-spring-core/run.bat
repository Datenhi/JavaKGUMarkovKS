@echo off
if exist out rmdir /s /q out
if exist sourses.txt del sourses.txt
dir lab7-spring-core /b /s *.java > sourses.txt
javac -cp ./lib/* -d ./out/ @sourses.txt
java -cp out;lib/* Main