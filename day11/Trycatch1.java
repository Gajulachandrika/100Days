class Trycatch1{
public static void main(String[] args){
try
{
System.out.println(8/0);
System.out.println("end of try!");
}
catch(ArithmeticException e)
{
System.out.println("divided by 0");
}
}
}
output
************
divided by 0
