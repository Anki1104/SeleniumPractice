package Overriding;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}

	void display() {
		System.out.println("iam display of animal2 class");
	}
}

class Dog2 extends Animal2 {
	@Override
	public void move() {
		System.out.println("Dog can walk");
		display();
	}

	public void calling() {
		move();
		Animal2 a1 = new Animal2();
		a1.move();
		super.move();
		System.out.println("iam calling");
	}
}

public class OverridingExample2 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.calling();

	}

}
