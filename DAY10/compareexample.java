import java.util.Scanner;
public class Compareexample{
public static void main(String[] args){
// input String in Uppercase
String str1 = new String("I LOVE MY FAMILY");
//input String to lowercase
String str2 = new String("i love my family");
System.out.println(str1.compareTo(str2));
}
}
output
**************
C:\Users\LENOVO\Documents>javac Compareexample.java

C:\Users\LENOVO\Documents>java Compareexample
-32
