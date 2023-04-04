package Constructor;

class A {
	int i = 10;

	A() {
		System.out.println("Running class A constructor");
	}

	void display() {
		System.out.println(" iam display of class A");
	}
}

class X {
	int j = 11;

	X() {
		System.out.println("Running class X constructor");
	}

	void display() {
		System.out.println(" iam display of class X");
	}
}

public class Cons5 {
	int a=11;
	void display() {
		System.out.println("iam display of class cons5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() of the class cons5 is started");
		A a1 = new A();
		System.out.println(a1.i);
		a1.display();
		X a2 = new X();
		System.out.println(a2.j);
		a2.display();
		Cons5 c1 = new Cons5();
		System.out.println(c1.a);
		c1.display();
	}

}
