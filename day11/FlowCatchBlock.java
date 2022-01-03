class FlowCatchBlock{
public static void main(String[] args){
{
int x = 20;
int y = 20;
try{
int num= x/y;
System.out.println("next-statement: Inside try block");
}
catch(Exception ex)
{
System.out.println("Exception");
}
System.out.println("next-statement: outside of try-catch");
}
}
}
output
***********
next-statement: Inside try block
next-statement: outside of try-catch

