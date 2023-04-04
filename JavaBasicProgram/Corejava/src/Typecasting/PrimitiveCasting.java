package Typecasting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
		double myDouble = myInt;
		double d = (double) myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);
		double salary = 297.9999873776f;
		int sal = (int) salary;
		long f = (long) salary;
		float f1 = (float) salary;
		System.out.println("Actual salary is :" + salary);
		System.out.println("salary is :" + sal);
		System.out.println("salary is :" + f);
		System.out.println("salary is :" + f1);

	}

}
