import java.util.Scanner;
class Details
{
 int roll_no,m1,m2,m3,m4,m5,marks;
 String name,branch;
 Scanner s= new Scanner(System.in);
 void input()
 {
 System.out.println();
  System.out.println("enter students rollno:");
 roll_no=s.nextInt();
 System.out.println("enter students name:");
 name=s.next();
System.out.println("enter students branch");
 branch=s.next();
System.out.println("enter students m1");
 m1=s.nextInt();
System.out.println("enter students m2");
 m2=s.nextInt();
System.out.println("enter students m3");
 m3=s.nextInt();
System.out.println("enter students m4");
 m4=s.nextInt();
System.out.println("enter students m5");
 m5=s.nextInt();
 }
 void calmarks()
 {
  marks=(m1+m2+m3+m4+m5)/5;
 System.out.println("result: "+marks);
 if(marks>=85)
	System.out.println("distinction");
 else if(marks>=70 && marks<=84)
	System.out.println("first class");
 else if(marks>=50 && marks<=69)
	System.out.println("second class");
 else 
	System.out.println("pass");
 }
 void display()
 {
 System.out.println();
 System.out.println("roll_no: "+roll_no);
 System.out.println("name: "+name);
 System.out.println("branch: "+branch);
 System.out.println("m1:" +m1+ "\tm2:" +m2+ "\tm3:" +m3+ "\tm4:" +m4+ "\tm5:" +m5 );
 
 }
 public static void main(String[] args)
 {
  Details d1=new Details();
  Details d2=new Details();
  Details d3=new Details();
  d1.input();
  d1.display();
 d1.calmarks();
  d2.input();
 d2.display();
  d2.calmarks();
 d3.input();
 d3.display();
  d3.calmarks();
}
}
