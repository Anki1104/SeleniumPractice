package InheritanceExample;

//parent class
class vehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
}

class bike extends vehicle {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}

class Car1 extends vehicle {
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}

class scooter extends vehicle {
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Inheritance4 {
	public static void main(String[] args) {
		scooter sc = new scooter();
		sc.wheels();
		sc.countwls();
		Car1 c = new Car1();
		c.wheels();
		c.countwlc();
		bike b = new bike();
		b.wheels();
		b.countwl();
	}
}