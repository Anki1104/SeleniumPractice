package Constructor;

public class Cons4 {
	int roll;
	double salary;

	Cons4(int r, double s) {
		roll = r;
		salary = s;
	}

	void display() {
		System.out.println(roll + "  " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons4 c1 = new Cons4(10, 20.098);
		c1.display();

		Cons4 c2 = new Cons4(20, 89.09);
		c2.display();
	}
}
