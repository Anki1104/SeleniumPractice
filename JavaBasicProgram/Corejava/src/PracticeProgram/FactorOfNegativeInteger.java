package PracticeProgram;

public class FactorOfNegativeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -100;
		System.out.println("fators of " +num +" are :");
		for (int i = num; i <=  Math.abs(num); ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.println(i + " ");
				}
			}
		}
	}
}