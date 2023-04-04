package abstractionExample;

abstract class abs1 {
	abstract void call1();

	abstract void call2();

	void display() {
		System.out.println("Hello");
	}
}

abstract class abs2 {
	abstract void call1();
	abstract void call2();

}

abstract class abs3 {
	void display() {
	}
}

public class DemoAbstract1 extends abs2 {
	void call1() {
		System.out.println("Hello");
	}

	void call2() {
		System.out.println("he");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAbstract1 d1 = new DemoAbstract1();
		d1.call1();
	}

}
