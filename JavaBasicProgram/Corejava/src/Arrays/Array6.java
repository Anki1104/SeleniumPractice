package Arrays;

class testreturnArray {
	static int[] getArray() {
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 90;
		num[2] = 40;
		return num;
	}
}

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = testreturnArray.getArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
