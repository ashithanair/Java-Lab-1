import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count =0,sum = 0;
		for(int i=num;i>0;i=(i/10))
		{
			count+=1;
		}
		System.out.println("No: of digits is "+count);
		for(int i=num;i>0;i=(i/10))
		{
			int rem=i%10;
			sum=(int) Math.pow(rem, count)+sum;
		}
		System.out.println("The result is "+sum);
		if(sum==num)
		{
			System.out.println("The given no: is an armstrong");
		}
		else
		{
			System.out.println("The given no: is not an armstrong");
		}
	}
}
