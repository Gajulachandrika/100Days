PROGRAM1
***************
import java.util.Scanner;
class Pattern
 {
      public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++) 
        {
          for(int j=1;j<=i;j++) 
           {
             System.out.print(j+" ");
            }
           System.out.println(); 
         }
       }
   }
OUTPUT:
*******************
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

PATTERN2:
***************
import java.util.Scanner;
class Pattern2
 {
      public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++) 
        {
           char ch = 65;
          for(int j=1;j<=i;j++) 
           {
             System.out.print(ch+" ");
             ch++;
            }
           System.out.println(); 
         }
       }
   }
OUTPUT:
*******************
5
A
A B
A B C
A B C D
A B C D E


PROGRAM3:
********************
import java.util.Scanner;
class Pattern3
{
public static void main(String args[])
 {
Scanner scan = new Scanner(System.in);
 int n = scan.nextInt();
 for(int i=1;i<=n;i++)
 {
  for(int j=1;j<=i;j++)
  {
   System.out.print("* ");
   }
  System.out.println();
  }
 }
}

OUTPUT:
*******************
5
*
* *
* * *
* * * *
* * * * *


PROGRAM4:
************
import java.util.Scanner;
class Pattern4
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
       {
        System.out.print(" "+i);
        }
       System.out.println(" ");
      }
   }
 }

OUTPUT
************

5
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5

  
PROGRAM-5
***********
import java.util.*;
class test7
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
          char c='A';
       for(int i=0;i<=n;i++)
     {
      for(int j=0;j<=i;j++)
       { 
       System.out.print((char)(c+i));
       
       }
       System.out.println(  );
     }
   }
 }


OUTPUT:
***************
4
A
BB
CCC
DDDD
EEEEE

PROGRAM-7
*************
import java.util.*;
 class test11
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
     space=n-1;
     for(int i=0;i<=n;i++)
      {
       for(int j=0;j<=space;j++)
        {
         System.out.print(" ");
        }
        space--;
        for(int j=1;j<=i;j++)
         {
          System.out.print(j+" ");
         }
        System.out.println(" ");
       }
    }

OUTPUT:
***********
5

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


 PROGRAM-9
***********
import java.util.*;
 class test11
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
      char ch = 'A';
     space=n-1;
     for(int i=0;i<=n;i++)
      {
       for(int j=0;j<=space;j++)
        {
         System.out.print(" ");
        }
        space--;
        for(int j=0;j<=i;j++)
         {
          System.out.print((char)(ch+j)+" ");
         }
        System.out.println(" ");
       }
    }
}

OUTPUT:
*************
4
    A
   A B
  A B C
 A B C D
A B C D E

 PROGRAM-11
***********
import java.util.*;
 class test11
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
     space=n-1;
     for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=space;j++)
        {
         System.out.print(" ");
        }
        space--;
        for(int j=1;j<=2*i-1;j++)
         {
          System.out.print("*");
         }
        System.out.println(" ");
       }
    }
}

OUTPUT:
****************
5
    *
   *
  *
 *
*

 
  PROGRAM-12
**************
import java.util.*;
 class test11
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
     space=n-1;
     for(int i=0;i<=n;i++)
      {
       for(int j=0;j<=space;j++)
        {
         System.out.print(" ");
        }
        space--;
        for(int j=1;j<=i;j++)
         {
          System.out.print(i+" ");
         }
        System.out.println(" ");
       }
    }
}

OUTPUT:
***********
5

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5


PROGRAM-13
****************
import java.util.*;
 class test11
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int space;
      char ch = 'A';
     space=n-1;
     for(int i=0;i<=n;i++)
      {
       for(int j=0;j<=space;j++)
        {
         System.out.print(" ");
        }
        space--;
        for(int j=0;j<=i;j++)
         {
          System.out.print((char)(ch+i)+" ");
         }
        System.out.println(" ");
       }
    }
}

OUTPUT:
*********
4
    A
   B B
  C C C
 D D D D
E E E E E


 PROGRAM-14
****************
import java.util.*;
class test7
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
          
       for(int i=5;i>0;i--)
     {
      for(int j=1;j<=i;j++)
       { 
       System.out.print(j+" ");
       
       }
       System.out.println(  );
     }
   }
 }
OUTPUT:
***************
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1



