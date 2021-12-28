import java.util.*;
import java.io.*;

class solution
{
public static void main(String[]argh)
{
scanner sc = new Scanner(System.in);
int t=in.nextInt();
for(int i=0;i<t;i++)
{
int a = in.nextInt();
int b = in.nextInt();
int n = in.nextInt();

for(int j=0;j<t;j++)
a = a+((int)Math.pow(2,j)*b);
system.out.println(a+" ");
  }
System.out.println();

}
}

expected output
2 6 14 30 62 126 254 510 1022 2046 
8 14 26 50 98