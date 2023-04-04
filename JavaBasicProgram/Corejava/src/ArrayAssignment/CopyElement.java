package ArrayAssignment;

public class CopyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,8,9,7,8};
		int[] copyArr = new int [arr.length];
		for(int i=0; i<arr.length; i++) {
			copyArr[i] = arr[i];
		}
		System.out.println("The original array is : ");
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]+ " ");
			}
			System.out.println("copy array is ");
			for(int i = 0; i<copyArr.length; i++) {
				System.out.println(copyArr[i]+ " ");
			}
		}
}


