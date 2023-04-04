package Constructor;

public class Constructor1 {
	Constructor1() {
		System.out.println("this is the zero para constructor ");
	}

	public Constructor1(char c) {
		System.out.println("this is single para contructor");
	}

	Constructor1(int a, int b) {
		System.out.println("this is the int para contructor");
	}

	Constructor1(double a, int b) {
		System.out.println("this is the double int para constructor");
	}

	Constructor1(int a, double b) {
		System.out.println("this is the int double para contructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1('d');
		Constructor1 c3 = new Constructor1(10, 20);
		Constructor1 c4 = new Constructor1(10.3, 30);
		Constructor1 c5 = new Constructor1(40, 22.9);
	}

}
