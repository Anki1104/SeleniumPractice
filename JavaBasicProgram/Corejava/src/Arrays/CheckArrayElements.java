package Arrays;

import java.util.Arrays;;

public class CheckArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empId = { 1, 2, 5, 3, 6, 7 };
		int[] cloneArr = empId.clone();
		int[] cloneArr1 = Arrays.copyOf(empId, 7);
		int[] cloneArr2 = Arrays.copyOfRange(empId, 0, 6);
		Arrays.sort(cloneArr);
		for (int a : empId) {
			System.out.print(a + ",");
		}
		System.out.println();
		for (int a : cloneArr) {
			System.out.print(a + ",");
		}
		System.out.println();
		System.out.println(Arrays.equals(empId, cloneArr));

	}

}
