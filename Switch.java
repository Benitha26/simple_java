import java.util.Scanner;
class Switch
{
 public static void main(String[] args)
  {
   int a,b,res;
	String op;
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 nos:");
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("enter opearator");
	op=s.next();
	switch(op)
	{
		case "+": res=a+b;
		         System.out.println("the addition is :"+res);
		         break;
		case "-": res=a-b;
		         System.out.println("the subtraction is :"+res);
		         break;
		case "*": res=a*b;
		         System.out.println("the mutiplication is :"+res);
		         break;
		case "/": res=a/b;
		         System.out.println("the division is :"+res);
		         break;
		default: System.out.println("Invalid operator");
			break;
	}
 }
}