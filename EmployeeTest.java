class EmployeeTest
{
 public static void main(String[] args)
 {
 Employee e1=new Employee();
 Employee e2=new Employee();
e1.input();
//float s=e1.calculateSal();
e1.calculateSal();
e1.display();
// System.out.println("total salary displayed from main:"+s);
e2.input();
//float s1=e1.calculateSal();
e2.display();
//System.out.println("total salary displayed from main:"+s1);
}
}