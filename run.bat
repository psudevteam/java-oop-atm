dir /n /B *.java > sources.java
javac @sources.txt
java src.main.java.Main
