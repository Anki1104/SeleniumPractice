package Overriding;

class Human {
	void eat() {
		System.out.println("Human is eating");
	}
}

class Boy extends Human {
	public void eat() {
		System.out.println("boy is eating");
	}
}

public class OverridingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy obj = new Boy();
		obj.eat();
		Human h1 = new Human();
		h1.eat();
	}

}
