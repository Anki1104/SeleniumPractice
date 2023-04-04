package PracticProgramUsingMethod;

public class CountNumberofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberofDigit1(0, 952);
		CountNumberofDigit1(0, 9524);
		
	}

	static void CountNumberofDigit1(int count, int num) {
		for (; num != 0; num /= 10) {
			++count;
		}
		System.out.println("Number of digits: " + count);
	}
}