import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
output
**********
C:\Users\LENOVO\Documents>javac Pattern1.java

C:\Users\LENOVO\Documents>java Pattern1
Enter the number of rows to print the pattern
5
** Printing the pattern... **
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
