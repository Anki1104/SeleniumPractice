package Pedefinedclasses.Scannerclass;

class Demo {
	void display() {
		System.out.println("Demo class of display method");
	}

	void callme() {
		System.out.println("callme method of demo class");
	}

	Demo() {
		System.out.println("Demo");
	}
}

public class StaticReference {
	static final Demo demoref = new Demo();
	static int age = 19;

	static void calling() {
		System.out.println("calling....");
	}

	void test() {
		System.out.println("static reference class test method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1 = new Demo();
		d1.display();
		d1.callme();
		StaticReference s1 = new StaticReference();
		s1.test();
		StaticReference.calling();
		System.out.println(StaticReference.age);
	}

}
