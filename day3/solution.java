import java.util.*;
import java.io.*;

class solution{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
try
{
long x=sc.nextLong();
System.out.println(x+" can be fitted in:");
if(x>=-128 && x<=127)
System.out.println("byte");   
 if(x>=-32768 && x<32767)
System.out.println("short");
 if(x>=-2147483648 && x<=2147483647)
System.out.println("int");
if(x>=-9223372036854775808L && x<=9223372036854775807L)
System.out.println("long");
}
catch(Exception e)
{
System.out.println(sc.next()+" can't be fitted anywhere.");
}
}
}
}
output
***********
-150 can befitted in:
*short
*int
*long
150000 can be fitted in:
*int
*long
1500000000 can be fitted in:
*int
*long
21333333333333333333333333333333333333333333333333333333333 cant be fitted in:
-1000000000000 can be fitted in:
*long