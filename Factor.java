import java.io.*;
class Factor
{
  public static void main(String[] args)
  {
    int num=15,factor=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factor=i;
        System.out.println(factor+" is a factor of "+num);
      }
    }  
  }
}
