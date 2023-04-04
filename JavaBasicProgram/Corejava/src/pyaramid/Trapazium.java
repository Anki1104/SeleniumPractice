package pyaramid;

public class Trapazium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for (int i = row; i >0; i--) {
			for (int j = 1; j <= i; j++) {
             System.out.print(" ");
			}
			for (int j = 0; j <= row; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
