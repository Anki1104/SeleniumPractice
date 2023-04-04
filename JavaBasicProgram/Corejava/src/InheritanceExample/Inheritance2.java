package InheritanceExample;

class fruit {
	fruit() {
		System.out.println("fruit class cons..");
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class apple extends fruit {
	apple() {
		System.out.println("Apple class Cons..");
	}

	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		apple fr = new apple();
		fr.taste();
		fr.shape();
	}
}