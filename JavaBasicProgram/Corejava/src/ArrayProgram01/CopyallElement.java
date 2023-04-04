package ArrayProgram01;

public class CopyallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(" print the original array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print( arr1[i]+" ");
		}
		System.out.println("");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print( arr2[i]+" ");
		}

	}

}
