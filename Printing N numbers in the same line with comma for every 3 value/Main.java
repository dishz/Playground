import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int numcount;
    for(numcount=1;numcount<=n;numcount++)
    {
      System.out.print(numcount);
      if( numcount%3==0)
      {
        System.out.print(",");
        
      }
    }
    }
  }

 
