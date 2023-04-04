package Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[] = { 10, 29, 73, 89, 73, 56, 11, 87, 89 };
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i] + " ");
		}
		int n = 1;
		for (int i = 0; i < n; i++) {
			int first = age[0], j;
			for (j = 1; j < age.length - 1; j++) {
				age[j] = age[j + 1];

			}
			age[j] = first;
		}
		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
	}

}
