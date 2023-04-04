package This;

class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		this.m();
	}
}

class ThisKeyword6 {
	void methodOne() {
		System.out.println("Inside Method One");
	}

	void methodTwo() {
		System.out.println("Inside Method Two");
		this.methodOne();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword6 t1 = new ThisKeyword6();
		t1.methodTwo();
		A a = new A();
		a.n();
	}
}
