import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args)
	{
					int flag=0;
					System.out.println("Enter the no: ");
					Scanner sc=new Scanner(System.in);
					int num=sc.nextInt();
					int m=num/2;
					if(num==0 || num==1)
					{
						System.out.println("The no: is neither prime nor consonant");
					}
					else
					{
						for(int i=2;i<=m;i++)
						{
							if(num%i!=0)
							{
								flag=1;
								
							}
							else
							{
								flag=0;
								break;
							}
						}
					
					
					
						if(flag==1)
						{
							System.out.println("The given no: is prime");
						}
						else 
						{
							System.out.println("The given no: is not prime");
						}
							
					}	

			
		}
		
		
	}
	
	





