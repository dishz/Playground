import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int cn=num;
      int dc=0;
      if(num==0)
      {
        System.out.println(num);
      }
      else
      {
        while(num>0)
        {
          dc++;
          num=num/10;
        }
      }
      num=cn;
      int sum=0;
      int pow=1;
      while(num>0)
      {
        int rem=num%10;
        for(int count=1;count<=dc;count++)
        {
          pow=pow*rem;
        }
        sum=sum+pow;
        pow=1;
        num=num/10;
      }
      if(sum==cn)
      {
        System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
        
      }
	}
}