import java.util.Scanner;
class Array{
public static void main(String[] args){
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("enter array size:");
n=s.nextInt();
int nums[]=new int[n];
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
nums[i]=s.nextInt();
}
System.out.println("number of elements in an array is:" + nums.length);
System.out.println("**************");
System.out.println("the array contents are:");
for(int j:nums) //for each loop
System.out.println(j);
}
}