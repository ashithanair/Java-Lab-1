import java.util.Scanner;
class SumOfN
{
  public static void main(String[] args)
  {
    int sum=0;
    System.out.println("Enter the value for n");
    Scanner ip=new Scanner(System.in);
    int n=ip.nextInt();
    for(int i=1;i<=n;i++)
    {
      sum+=i;
    }
    System.out.println("Sum of "+n+" natural no:s is "+sum);
  }
}
