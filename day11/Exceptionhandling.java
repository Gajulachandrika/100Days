
program 1:
import java.util.*;
class Exceptionhandling{
    public static void main(String[] args){
        System.out.println(5/0);
        System.out.println("End of program!");
        
    }
}
output
******
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exceptionhandling.main(Exceptionhandling.java:4)