import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int num1=in.nextInt();
      int a,b;
      a=num1/10;
      b=num1%10;
      int sum=a+b;
      System.out.println(sum);
	}
}