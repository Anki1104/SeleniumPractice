package PracticeProgram;

public class TocheckPalindromeUsingWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0, temp;
		int n = 44;
		temp = n;
		while (n > 0) {
			i = n % 10;
			sum = (sum * 10) + i;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("palindrom number");
		} else {
			System.out.println("not palindrome number");
		}
	}

}
