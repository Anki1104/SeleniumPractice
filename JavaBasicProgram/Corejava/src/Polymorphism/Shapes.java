package Polymorphism;

class Shapes {
	public void area() {
		System.out.println("Find area");
	}

	public void area(int r) {
		System.out.println("Circle area = " + 3.14 * r * r);
	}

	public void area(double b, double h) {
		System.out.println("triangle area = " + 8.1 * b * h);
	}

	public void area(int l, int b) {
		System.out.println("rectangle area = " + l * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1 = new Shapes();
		s1.area(87);
		s1.area(10., 6.6);
		s1.area(39, 40);
		s1.area();

	}

}
