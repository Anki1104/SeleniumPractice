package InterviewQuestion;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i,number, fact = 1;
		number = sc.nextInt();
		for (i = 1; i <=number; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial number is: " + fact);
	}

}
