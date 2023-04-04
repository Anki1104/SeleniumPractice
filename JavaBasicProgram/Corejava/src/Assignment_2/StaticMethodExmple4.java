package Assignment_2;

public class StaticMethodExmple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a', c2 = 'z';
		int c1value = c1;
		int c2value = c2;
		FindAsciiValue(c1value, c2value);
		c1 = 'A';
		c2 = 'Z';
		c1value = c1;
		c2value = c2;
		FindAsciiValueCapital(c1value, c2value);
	}

	public static void FindAsciiValue(int c1value, int c2value) {
		System.out.println("The Ascii value of a is:" + c1value);
		System.out.println("The Ascii value of z is:" + c2value);
	}

	public static void FindAsciiValueCapital(int c1value, int c2value) {
		System.out.println("The Ascii value of A is :" + c1value);
		System.out.println("The Ascii value of Z is :" + c2value);
	}
}
