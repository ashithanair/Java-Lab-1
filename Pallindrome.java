import java.util.Scanner;
class Pallindrome
{
  public static void main(String[] args)
  {
    System.out.println("Enter the no: to be checked");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rem=0,rev=0;
    int temp=num;
    while(num>0)
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10;
      if(rev==temp)
        System.out.println("The no: is a pallindrome");
      else
        System.out.println("The no: is not a pallindrome");
  }
}
