package Polymorphism;

public class Compiletime {
	static void Sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers");
	}

	static void Sum(int d, int e, int f) {
		int g = d + e + f;
		System.out.println("Addition of three number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletime.Sum(34, 11);
	}

}
