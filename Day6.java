program 1:
************
import java.util.Scanner;
class Pattern1 
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
 
OUTPUT
***************
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

PROGRAM2:
************
import java.util.Scanner;
class Pattern2
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j+" ");
       }
         System.out.println();
     }
   }
}

OUTPUT
**********
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

PROGRAM 3:
*****************
import java.util.Scanner;
class Triangle
 {
      public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++) 
        {
          for(int j=1;j<=i;j++) 
           {
             if(j==i || j==1 || i==n)
             System.out.print(" "+j);
             else
              System.out.print(" ");
            }
           System.out.println(); 
         }
       }
   }

OUTPUT:
**************
5
 1
 1 2
 1  3
 1   4
 1 2 3 4 5

PROGRAM4:
*************************
import java.util.Scanner;
public class Pyramid1 {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   
    int rows = sc.nextInt(); 
   int k = 0;
    int count = 0;
    int count1 = 0;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++count;
      }

      while (k != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + k) + " ");
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1) + " ");
        }

        ++k;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}
OUTPUT:
****************
5
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

PROGRAM5:
****************
import java.util.Scanner;
class Triangle1
 {
      public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        for(int j=1;j<=n;j++) 
        { 
            for(i=1;i<=n;i++)
           {
             if(j==i || j==1 || i==n)
             System.out.print(i+"  ");
             else
             System.out.print("");
            }
           System.out.println(); 
         }
       }
   }
OUTPUT:
***************
5
1  2  3  4  5
2        5
3     5
4  5
5