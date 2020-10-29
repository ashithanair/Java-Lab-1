import java.io.*;
class Prime
{
  public static void main(String[] args)
  {
    int num=17,m=num/2,prime=0;
        for(int i=m;i>0;i--)
          if(num%m!=0)
            prime=num;
        System.out.println("The no: "+prime+" is prime");


  }
}
