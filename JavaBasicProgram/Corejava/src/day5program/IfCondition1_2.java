package day5program;

public class IfCondition1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 55;
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		checkEvenOddNumber(150);
		System.out.println(isNumberEven(150));

	}

	static void checkEvenOddNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("Given number is even number:" + num);
		} else {
			System.out.println("Given number is odd number : " + num);
		}
	}

	static boolean isNumberEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
