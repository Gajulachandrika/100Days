import java.util.Scanner;
public class StringMethod{
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
**********
Frequency of t is:1