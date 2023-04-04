package Encapsulation;

class Demo {
	private int empId = 1001;
	private double salary = 2309.80;

	public int getempId() {
		return empId;

	}

	public double getsalary() {
		return salary;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		// System.out.println(d1.empId);
		// System.out.println(d1.salary);
		System.out.println(d1.getempId());
		System.out.println(d1.getsalary());
		d1.setempId(1002);
		d1.setsalary(3894.898);
		System.out.println(d1.getsalary());
		System.out.println(d1.getempId());
	}

}
