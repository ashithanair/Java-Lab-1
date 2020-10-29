import java.util.Scanner;
class Amstrong
{
  public static void main(String[] args)
  {
      System.out.println("Enter the no: to be checked");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int i,a,r=1,sum=0;
      for(i=num;i>0;i=i/10)
      {
        a=i%10;
        r=a*a*a;
        sum+=r;
      }
      if(num==sum)
        System.out.println("The no: is an amstrong");
      else
        System.out.println("The no: is not an amstrong");
  }
}
