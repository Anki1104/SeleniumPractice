package predefinedclasses.stringclasses;

public class Testing {

	// TODO Auto-generated method stub
	final int age;
	final double salary;
	final String name;

	Testing(int a, double b, String s) {
		age = a;
		salary = b;
		name = s;

	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Testing t1 = new Testing(10, 90000, "ankita");
		t1.display();
	}

}
