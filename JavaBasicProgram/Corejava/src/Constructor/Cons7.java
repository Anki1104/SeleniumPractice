package Constructor;

class B {
	int a = 10;

	B() {
		System.out.println("Running for class B");
		a = 230;
	}
}

public class Cons7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println("*************");
		B b2 = new B();
		System.out.println(b2.a);
	}

}
