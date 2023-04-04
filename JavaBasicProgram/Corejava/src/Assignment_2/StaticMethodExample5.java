package Assignment_2;

public class StaticMethodExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15, b = 5, q, r;
		q = a % b;
		r = a / b;
		System.out.println("Number1: " + a);
		System.out.println("Number2: " + b);
		QuotientAndRemainder(q, r);
		
		
	}

	public static void QuotientAndRemainder(int q, int r) {
		System.out.println("Q: " + q);
		System.out.println("Rem: " + r);
	}

}
