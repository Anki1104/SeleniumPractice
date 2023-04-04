package pyaramid;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char last = 'D', alphabet = 'A';
		for (int i = 0; i <= (last - 'A'); ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(alphabet + " ");
			}
			++alphabet;
			System.out.println();
		}
	}
}