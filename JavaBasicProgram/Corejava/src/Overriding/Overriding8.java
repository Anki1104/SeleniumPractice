package Overriding;

class Parent4 {
	static void m1() {
		System.out.println("From parent " + "static m1()");
	}
	void m2() {
		System.out.println("From parent " + "non-static(instance) m2()");
	}
}
class Child4 extends Parent4 {
	static void m1() {
		System.out.println("From child static m1()");
	}
	@Override
	public void m2() {
		System.out.println("From child " + "non-static(instance) m2()");
	}
}
class Overriding8 {
	public static void main(String[] args) {
		Parent4 obj1 = new Child4();
		obj1.m1();
		obj1.m2();
	}
}