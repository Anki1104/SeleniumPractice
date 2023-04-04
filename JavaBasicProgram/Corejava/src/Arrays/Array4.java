package Arrays;

class testArray3{
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	static void max(int arr[]) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[] = {10, 74, 89, 38 ,1};
testArray3.max(a);
testArray3.min(a);
	}

}
