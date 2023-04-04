package Arrays;

public class M_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 7,8,9,4} };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr.length);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
		}
			char[] chararr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
			for (int i = 0; i < chararr.length; i++) {
				System.out.println(chararr.length);
				for (int j = 0; j < chararr[i].length; j++) {
					System.out.println(chararr[i][j] + " ");
				}
				System.out.println(" ");
			}
		}

	}

