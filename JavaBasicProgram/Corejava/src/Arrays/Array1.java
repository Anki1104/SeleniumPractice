package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a = new int[5];
		// int a[] = new int [5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0] = 10;
		a[1] = 20;
		a[3] = 40;
		a[4] = 60;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("for each loop");
			for (int num : a) {
				System.out.println(num);
			}

		}
	}

}
