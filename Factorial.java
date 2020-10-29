import java.util.Scanner;
class Factorial
{
  public static void main(String[] args)
  {
    int fact=1,i=1;
    System.out.println("Enter the value of n");
    Scanner ip=new Scanner(System.in);
    int n=ip.nextInt();
    while(i<=n)
      for(i=1;i<=n;i++)
      {
         fact*=i;
         System.out.println("Factorial of "+i+" is "+fact);
      }
    }
}
