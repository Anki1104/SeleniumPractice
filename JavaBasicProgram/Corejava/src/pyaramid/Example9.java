package pyaramid;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int i= rows; i>=1; i--) {
			for (int j = 1; j <= rows - i; ++j) {
				System.out.print("  ");
			}
			for (int j = i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}

			for (int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}