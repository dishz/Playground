import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a,b;
      int num1=in.nextInt();
     a=num1/100;
      b=num1%10;
      System.out.println(a+b);
	}
}