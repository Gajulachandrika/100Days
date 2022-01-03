program 2:
import java.util.*;
class Trycatch{
public static void main(String[] args){
int a=40;
for(int i=20;i>=0;i--)
try{
System.out.println(a/i);
}catch(ArithmeticException e){
System.out.println(e);
}
}
}
output
**********
2
2
2
2
2
2
2
3
3
3
4
4
5
5
6
8
10
13
20
40
java.lang.ArithmeticException: / by zero
