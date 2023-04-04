package Assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc = new Scanner(System.in);
		int string = sc.nextInt();
		int reverse = 0;
		while (string != 0) {
			int remainder = string % 10;
			reverse = reverse * 10 + remainder;
			string = string / 10;

		}
	}
}
