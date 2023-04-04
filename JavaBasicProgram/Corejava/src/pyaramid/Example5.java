package pyaramid;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char last = 'A', alphabet = 'E';
		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(alphabet + " ");
			}
			--alphabet;
			System.out.println();
		}
	}

}
