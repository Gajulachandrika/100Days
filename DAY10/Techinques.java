import java.util.Scanner;
public class Techinques{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
String name="The Hacker";
String sf1=String.format("name is%s",name);
String sf2=String.format("value is%f",42.85564);
String sf3=String.format("value is%f",70.54964);
System.out.println(sf1);
System.out.println(sf2);
System.out.println(sf3);
}
}
output
*************
output
***************
C:\Users\LENOVO\Documents>java Techinques
name isThe Hacker
value is42.855640
value is70.549640