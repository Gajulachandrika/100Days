import java.util.Scanner;
public class Lengthexample{
public static void main(String[] args){
String str = "Going to College";
int Count = 0;
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i) == 't'){
Count ++;
}
}
System.out.println("Frequency of t is: "+Count);
}
}
output
********
C:\Users\LENOVO\Documents>javac day10.java

C:\Users\LENOVO\Documents>java day10
Frequency of t is: 1
