class Employee1
{
 int id;
 String name;
 Employee1()
 {
   System.out.println("Employee Constructor");
 }
}
class Developer1 extends Employee1
{
 String skills;
 Developer1()
 {
  //super(); // invokes base class constructor
  System.out.println("Developer Constructor");
 }

public static void main(String[] args)
{
 Employee1 e1=new Employee1();
 Developer1 d1=new Developer1();
}
}