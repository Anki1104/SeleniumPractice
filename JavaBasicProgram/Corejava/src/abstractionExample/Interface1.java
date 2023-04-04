package abstractionExample;

interface i1 {
}

interface Interface {
	int salary = 25000;

	void draw();
}

class Rectangle1 implements Interface {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Interface {
	public void draw() {
		System.out.println("drawing circle");
	}
}

class Interface1 {
	public static void main(String args[]) {
		System.out.println("Interface variable salary: " + Interface.salary);
		Rectangle1 r1 = new Rectangle1();
		r1.draw();//
		Circle c1 = new Circle();
		c1.draw();//
		Interface d = new Circle();
		d.draw();//
	}
}
