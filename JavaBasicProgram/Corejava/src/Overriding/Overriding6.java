package Overriding;

class parent2 {
	private void m1() {
		System.out.println("from parent m1()");
	}

	protected void m2() {
		System.out.println("form parent m2()");
	}
}

class child2 extends parent2 {
	private void m1() {
		System.out.println("from child m2()");
	}
}

class Overriding6 {

	public static void main(String[] args) {
		parent2 p1 = new parent2();
		p1.m2();
		parent2 p2 = new parent2();
		p2.m2();
	}

}
