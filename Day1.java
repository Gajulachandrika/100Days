 PROGRAM 1:
*************
 public class Example
{
 public static void main(String args[])
{
 System.out.println("Hello world");
 System.out.println("Hello Java");
 }
}
 
OUTPUT:
************
Hello world
Hello Java


PROGRAM 2:
**************
import java.util.Scanner;
public class Conditional
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  if(n%2==0)
  {
   if(n<=2 && n<=5)
   {
    System.out.println("Not weird");
   }
   else if(n<=6 && n<=20)
   {
    System.out.println("Weird");
   }
   else
   {
    System.out.println("Not weird");
   }
  }
  else
   {
    System.out.println("Weird");
   }
 }
}

OUTPUT:
**************
Enter any number
76
Not weird

PROGRAM 3:
*****************
import java.util.Scanner;
public class StdInOut
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Scanner s=new Scanner(System.in);
 System.out.println("Enter values:");
 int x=sc.nextInt();
 double y=sc.nextDouble();
 String z=s.nextLine();
 
 System.out.println("String:"+z);
 System.out.println("Double:"+y);
 System.out.println("Integer:"+x);
}
}

OUTPUT:
***************
Enter values:
76
3.86
Hi Priya
String:Hi Priya
Double:3.86
Integer:76


PROGRAM 4:
****************
import java.util.Scanner;
public class Standard
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter input:");
  for(int i=0;i<3;i++)
  {
    String s=sc.next();
    int x=sc.nextInt();
    System.out.println(s +"\t"+ x);
  }
 } 
}

OUTPUT:
Enter input:
java 100 cpp 50 python 76
java    100
cpp     50
<<<<<<< HEAD
python  76																									
=======
python  76																		--------------------------------------------------------------------------------------------------------------------								


PROGRAM 5:
**************
import java.util.Scanner;
public class Multiple
{
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number:");
  int m=sc.nextInt();
  for(int i=1;i<=10;i++)
  {
    n=m*i;
    System.out.println("5*"+i+"="+n);
  }
 }
}

OUTPUT:
**************
enter any number:
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50