package PracticeProgram;

public class ReverseNumberUsingWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
				number = number / 10 ;
		}
		System.out.println("The reverse of the given number is: " + reverse);

	}

}
//123%10=3
//0=0*10+3=3
//123/10=12
//12%10=2
//3*10+32