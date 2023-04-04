package PracticeProgram;

public class CountNumberUsingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 2784;
		while (num != 0) {
			num /= 10;
			++count;
		}
		System.out.println(count);
	}
}