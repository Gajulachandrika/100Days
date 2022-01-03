import java.util.Scanner;
public class Marks
 {  
    public static void main(String[] args) {  
        String str = "Welcome to Javatpoint portal";          
        for (int i=0; i<=str.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }  
        }  
    }  
} 
output
*******************
C:\Users\LENOVO\Documents>javac Marks.java

C:\Users\LENOVO\Documents>java Marks
Char at 1 place e
Char at 3 place c
Char at 5 place m
Char at 7 place
Char at 9 place o
Char at 11 place J
Char at 13 place v
Char at 15 place t
Char at 17 place o
Char at 19 place n
Char at 21 place
Char at 23 place o
Char at 25 place t
Char at 27 place l 