package Polymorphism;

class Animals {
	void eat() {
		System.out.println("Animals eat");
	}
}

class Herbivours extends Animals {
	void eat() {
		System.out.println("Herbivours animals can eat plant");
	}
}

class carnivours extends Animals {
	void eat() {
		System.out.println("carnivours animals can eat meat");
	}
}

class omnivours extends Animals {
	void eat() {
		System.out.println("omnivours animals can eat plant and meat");
	}
}

public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a1 = new Animals();
		a1.eat();
		Herbivours h1 = new Herbivours();
		h1.eat();
		carnivours c1 = new carnivours();
		c1.eat();
		omnivours o1 = new omnivours();
		o1.eat();
	}

}
