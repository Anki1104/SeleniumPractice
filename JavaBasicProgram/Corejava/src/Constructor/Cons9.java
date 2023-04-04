package Constructor;

class Cons9 {
	int roll;
	double salary;

	Cons9() {
		System.out.println("Zero-param cons is started");
		roll = 10;
		salary = 20;
		System.out.println("Zero-param cons is Ends");
	}

	void display() {
		System.out.println(roll + " " + salary);//
	}

	public static void main(String args[]) {
		Cons9 c1 = new Cons9();
		c1.display();
		Cons9 c2 = new Cons9();
		c2.display();
	}
}