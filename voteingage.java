import java.util.*;
class voteingage
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age: ");
int age =sc.nextInt();
if(age>18)
{
System.out.println("your age is eligible for voteing");
}
else
{
	System.out.print("not eligible for voteing");
}
}
}

