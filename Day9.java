 Program1:
****
import java.util.Scanner;

public class SolidRectangle {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int rows, columns, i, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Number of Rows : ");
		rows = sc.nextInt();	
		
		System.out.print(" Please Enter Number of Columns : ");
		columns = sc.nextInt();		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
	}
}
Output:
***
Please Enter Number of Rows : 3
 Please Enter Number of Columns : 5
* * * * * 
* * * * * 
* * * * *

Program2:
****************
import java.util.*;

public class HollowRectangle {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Rectangle Rows & Columns = ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		System.out.println("Printing Hollow Rectangle Star Pattern");
		
		for (int i = 0; i < rows; i++ ) 
		{
			for (int j = 0 ; j < columns; j++ ) 
			{
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
Output
************
Enter Hollow Rectangle Rows & Columns = 3 5
Printing Hollow Rectangle Star Pattern
 *  *  *  *  *
 *           *
 *  *  *  *  *

Program3:
***************
import java.util.Scanner;  
public class HollowDiamondPattern1  
{  
public static void main(String args[])  
{  
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number of rows: ");    
int rows=scan.nextInt();  
System.out.print("Enter the symbol you want to print: ");     
char symbol=scan.next().charAt(0);    
for(int i=1; i<=rows; i++)  
{  
for(int j=rows; j>i; j--)  
{        
System.out.print(" ");  
}  
System.out.print(symbol);  
for(int j=1; j<(i-1)*2; j++)  
{        
System.out.print(" ");  
}  
if(i==1)  
{        
System.out.print("\n");  
}  
else  
{            
System.out.print(symbol+"\n");  
}  
}      
for(int i=rows-1; i>=1; i--)  
{  
for(int j=rows; j>i; j--)  
{            
System.out.print(" ");  
}    
System.out.print(symbol);  
for(int j=1; j<(i-1)*2; j++)  
{     
System.out.print(" ");  
}  
if(i==1)  
{          
System.out.print("\n");  
}  
else  
{        
System.out.print(symbol+"\n");  
}  
}  
}  
}  

Output:
**************
Enter the number of rows: 10
Enter the symbol you want to print: *
         *
        * *
       *   *
      *     *
     *       *
    *         *
   *           *
  *             *
 *               *
*                 *
 *               *
  *             *
   *           *
    *         *
     *       *
      *     *
       *   *
        * *
         *


Program4:
********************
import java.util.*;
public class Halfdiamond1 {
    
 public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt(); 
System.out.print("Enter Symbol : ");
 
char c = sc.next().charAt(0);
 
for(int i=1;i<=n;i++)
{
 
for(int j=1;j<=i;j++)
 
{
System.out.print(c);
}
System.out.println();
 
} 
for(int i=n-1;i>0;i--)
{
 
for(int j=1;j<=i;j++)
 
{
System.out.print(c);
}
System.out.println();
} 
}
}

Output:
****************
Enter N : 
10
Enter Symbol : *
*
**
*
**
***
**
***
****
***
****
***
****
***
**
***
**
*
**
*
  
program5
*****************
Program5:
****
import java.util.*;
 
class Diamond
{
    static void printDiamond(int n)
    {
        int space = n - 1;
        for (int i = 0; i < n; i++)
    {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            space--;
        }
        space=0;
        for (int i = n; i > 0; i--)
        {
         for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            space++;
        }
    }
    public static void main(String[] args)
    {
        printDiamond(10);
         
    }
}
  
Output:
***   
        * *   
       * * *  
      * * * * 
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * * 
        * *
         *



