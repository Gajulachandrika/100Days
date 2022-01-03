import java.io.*;
import java.util.*;
public class Stringjoin1{
public static void main(String[] args){
String date = String.join("/","20","12","94");
System.out.println(date);
String time = String.join(":","12","6","45");
System.out.println("" +time);
}
}
output
**********
C:\Users\CHINTHA JAHNAVI\Documents>javac Stringjoin1.java

C:\Users\CHINTHA JAHNAVI\Documents>java Stringjoin1
20/12/94
12:6:45