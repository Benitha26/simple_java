class Greatest
{
 public static void main(String[] args)
 {
  int a=5,b=2,c=6;
  if((a>b) && (a>c))
  {
    System.out.println("a is greatest"+a);
  }
  else if((b>c) && (b>a))
  {
    System.out.println("b is greatest"+b);
  }
  else
  {
    System.out.println("c is greatest"+c);
  }
}
}