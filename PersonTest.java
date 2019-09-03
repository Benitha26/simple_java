import java.util.Scanner;
class Person
{
  private String name;
  private int age;
  private String cons;
  Scanner s;
  Person() //
  {
    System.out.println("voter eligibility app");
    age=0;
    name="";
    cons="Bengaluru";
    s=new Scanner(System.in);
  }
  Person(String n, int a)
  {
    name=n;
    age=a;
  }
  Person(String n, int a,String c)
  {
    name=n;
    age=a;
    cons=c;
  }
  public void input() {
    System.out.println("enter your name:");
    name=s.next();
    System.out.println("enter your age:");
    age=s.nextInt();
  }
  public void print()
  {
    System.out.println("name is:"+name);
    System.out.println("age is:"+age);
    System.out.println("constituency is:"+cons);
  }
  public void eligible()
  {
    if(age>18)
      System.out.println("Eligible");
    else
      System.out.println("Not Eligible");
  }
}
  class PersonTest
  {
    public static void main(String[] args)
   {
     Person objPerson=new Person();
     Person objPerson1=new Person("ram",32);
     Person objPerson2=new Person("mike",50,"delhi");

     objPerson.input();
     objPerson.eligible();
     objPerson.print();

     objPerson1.eligible();
     objPerson1.print(); 

     objPerson2.eligible();
     objPerson2.print(); 
   }
 }
