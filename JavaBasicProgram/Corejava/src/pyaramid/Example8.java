package pyaramid;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5, k = 0, count=0 , count1=0;
		for (int i = 1; i <= rows; i++, k = 0) {
			for (int j = 1; j <=rows - i; j++) {
				System.out.print( "  ");
				++count;
			}
			while (k != 2 * i - 1) {
				if (count <= rows - 1) {
			          System.out.print((i + k) + " ");
			          ++count;
			        } else {
			          ++count1;
			          System.out.print((i + k - 2 * count1) + " ");
			        }

				++k;
			}
			count1 = count=k=0;
			System.out.println();
		}

	}

}
