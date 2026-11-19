@echo off
if exist out rmdir /s /q out
if exist sourses.txt del sourses.txt
dir lab8-autowired /b /s *.java > sourses.txt
javac -cp ./lib/* -d ./out/ @sourses.txt
java -cp out;./lib/* src.lab.Main