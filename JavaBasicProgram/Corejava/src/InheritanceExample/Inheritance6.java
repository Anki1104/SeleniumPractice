package InheritanceExample;

class A3 {
	void msg() {
		System.out.println("hello");
	}
}

class B3 {
	void msg() {
		System.out.println("welcome");
	}
}

class Inheritance6 extends A3 {
	Inheritance6() {
		super();
	}

	class B3 extends A3 {
		B3() {
			super();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance6 obj = new Inheritance6();
		obj.msg();
		System.out.println("print :"+B3.class);
		
	}
}
