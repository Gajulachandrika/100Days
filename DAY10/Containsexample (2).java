import java.io.*;
import java.util.*;
public class Containsexample
{
public static void main(String[] args)
{
String name = "Tell me the truth";
System.out.println(name.contains("me"));
System.out.println(name.contains("the"));
System.out.println(name.contains("bindu"));
}
}
output
********

C:\Users\CHINTHA JAHNAVI\Documents>javac Containsexample.java

C:\Users\CHINTHA JAHNAVI\Documents>java Containsexample
true
true
false