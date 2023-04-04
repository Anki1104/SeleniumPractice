package PracticeProgram;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 5, res;
		byte op = '%';
		switch (op) {
		case '+':
			res = +(num1 + num2);
			System.out.println(res);
			break;
		case '-':
			res = +(num1 - num2);
			System.out.println(res);
			break;
		case '*':
			res = +(num1 * num2);
			System.out.println(res);
			break;
		case '/':
			res = +(num1 / num2);
			System.out.println(res);
			break;
		case '%':
			res = +(num1 % num2);
			System.out.println(res);
			break;
		default:
			System.out.println("unknown operation");
			break;
		}
	}
}
