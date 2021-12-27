
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class file {
public static void main(String[] args) {
System.out.println("Hello world");
System.out.println("I am a file");
System.out.println("Read me until end-of-file");
Scanner sc= new Scanner(System.in);
int lineNumber = 1;
while(sc.hasNext()){
lineNumber++;
System.out.println(""+lineNumber+" "+sc.nextLine());
}
}
}
output
C:\Users\LENOVO\Documents>javac file.java

C:\Users\LENOVO\Documents>java file
Hello world
I am a file
Read me until end-of-file



