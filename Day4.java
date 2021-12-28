
import java.util.Scanner;
public class primes{
static int count;
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=2;i<=num;i++)
{
if(num%i==0)
count++;
}
if(count==00)
count++;
}
if(count==0){
System.out.println(num+ "is a prime number");
}
else{
System.out.println(num+ "is not a prime");
}
sc.close();
}
}
output
sample input0 :29
29 is a prime number
sample output1: 33
33is NOT a prime number
program2
import java.io.*;
import java.util.*;

    public class Prg4
    {
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int startingIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        sc.close();
 
        System.out.println(s.substring(startingIndex,endIndex));
      }
    }
output
programming
7 8
chandu
program3
import java.io.*;
import java.util.*;

public class Solution4 
{

    public static void main(String[] args) 
 {
 
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            System.out.println(A.length()+B.length());
            if(A.compareTo(B)>0)
             {
            System.out.println("yes");
             }
            else
             {
            System.out.println("No");
             }
         
    System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1));
    System.out.println(B.substring(0, 1).toUpperCase()+B.substring(1));
 }

}

OUTPUT:

C:\526>java Solution4
bindu chandu
8
yes
bindu
chandu
program4
import java.io.*;
import java.util.*;
public static Program3
{
  public static void main(String args[])

   {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      int i=0;
      int n=str.length()-1;
        String result ="YES";
      while(i<n) {
                  if(str.charAt(i)!=str.charAt(n))
                  {
                        result ="NO";
                      System.out.println(str +"Iis a Palindrome:"+result);
                      System.exit(0);
                   }
                   i++;
                   n--;
                 }
            System.out.println(str+" Is a Palindrome:"+ result);
    }
}

OUTPUT:

yes
program5
//**Anagrams:

import java.io.*;
import java.util.*;

  public class Program4
  {
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      if(checkAnagram(str1,str2))
       {
         System.out.println(str1+"and"+str2+"are Anagrams");
       }
        else{
           System.out.println(str1+"and"+str2+"are NOT Anagrams");
            }
           sc.close();
       }
           public static boolean checkAnagram(String str1,String str2)
           {
             str1=str1.replaceAll("s","");
             str2=str2.replaceAll("s","");
 
              if(str1.length()!=str2.length())
                {
                   return false;
                  }
                   else{
                          char[]array1=str1.toLowerCase().toCharArray();
                          char[]array2=str2.toLowerCase().toCharArray();
            
                         Arrays.sort(array1);
                         Arrays.sort(array2);
                        return(Arrays.equals(array1,array2));
                 }
           }
   }



OUTPUT:
 

anagram
margana
anagramandmarganaare Anagrams



C:\526>java Program4
anagramm
marganaa
anagrammandmarganaaare NOT Anagrams




