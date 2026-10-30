@echo off
if exist out rmdir /s /q out
if exist sources.txt del sources.txt
dir lab6-exception /b /s *.java > sources.txt
javac -d ./out/ @sources.txt
java -cp out Main