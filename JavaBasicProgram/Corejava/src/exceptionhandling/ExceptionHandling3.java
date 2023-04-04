package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling3 {
	public int divideNum(int m, int n) {
		int div = m / n;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling3 e1 = new ExceptionHandling3();
		  Scanner sc = new Scanner(System.in);
		  int num1; int num2;
		  System.out.println("Enter two number");
		  num1 =sc. nextInt();
		  num2 = sc.nextInt();
		  try {
			  System.out.println(e1.divideNum(num1, num2));
		  }catch(ArithmeticException e) {
			  System.out.println("\n number can not be divided by 0 "+e);
		  }
		  System.out.println("rest of the code");
		  
	}
}
