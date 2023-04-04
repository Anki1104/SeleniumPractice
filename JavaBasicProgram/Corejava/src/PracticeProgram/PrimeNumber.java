package PracticeProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count;
		System.out.println("Enter n value : ");
		for (int j = 1; j <= 20; j++) {
			count = 0;
			for ( i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(j + " ");
		}
	}

}
