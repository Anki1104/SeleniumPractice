package Overriding;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}

class OverridingExample4 extends ABC {
	public void myMethod() {
		super.myMethod();

		System.out.println("overriding method of class overridin4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExample4 a = new OverridingExample4();
		a.myMethod();
	}

}
