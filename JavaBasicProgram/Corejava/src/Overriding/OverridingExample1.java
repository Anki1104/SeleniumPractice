package Overriding;

class Animal1 {
	public void move() {
		System.out.println("Animal can move");
	}
}

class Dog extends Animal1{
@Override
	public void move() {
	System.out.println("dogs can walk");
	}
	public void bark() {
		System.out.println("dogs can bark");
	}
}

public class OverridingExample1 {

	public static void main(String[] args) {
		Animal1 a1 = new Animal1();
		a1.move();
		Dog d = new Dog ();
		d.move();
		d.bark();
		Animal1 p = new Dog();
		p.move();
		
	}

}
