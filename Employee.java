import java.util.Scanner;
class Employee
{
 int emp_Id;
 String emp_Name,dept;
 float basic,hra,tax,totalSal;
 Scanner s;
 void input()
 {
 s=new Scanner(System.in);
 System.out.println("enter employee id,name,department and basic salary");
 emp_Id=s.nextInt();
 emp_Name=s.next();
 dept=s.next();
 basic=s.nextFloat();
 }
 void calculateSal()
 {
 hra=basic*.010f;
 tax=basic*.05f;
 totalSal=(basic+hra)-tax;
 }
 void display()
 {
 System.out.println("the employee deatils:");
System.out.println("the employee id:"+emp_Id);
System.out.println("the employee name:"+emp_Name);
System.out.println("the employee dept:"+dept);
System.out.println("total salary:"+totalSal);
}
}
		
