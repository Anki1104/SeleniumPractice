package Overriding;

class parent {
	void show() {
		System.out.println("parent show");
	}
}

class Child extends parent {
	@Override
	void show() {
		System.out.println("child show()");
	}

}

public class Overriding5 {

	public static void main(String[] args) {
		parent obj1 = new parent();
		obj1.show();
		parent obj2 = new parent();
		obj2.show();
	}

}
