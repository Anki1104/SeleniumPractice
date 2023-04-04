package exceptionhandling;

public class ExceptionHandling2 {
	static void method() {
		System.out.println("Inside the method");
		throw new ArithmeticException(" throwing ArithmaticException ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println("caught in the main() method");
		}
		System.out.println("Rest of the code");
	}

}
