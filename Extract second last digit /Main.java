import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int a,b;
      a=num1/10;
      b=a%10;
      System.out.println(b);
	}
}