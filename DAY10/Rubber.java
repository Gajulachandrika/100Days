import java.util.Scanner;
public class Rubber{
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint.com";  
        System.out.println(str.endsWith("point"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com");  
    }
}  
\LENOVO\Documents>javac Rubber.java

C:\Users\LENOVO\Documents>java Rubber
false
String ends with .com 