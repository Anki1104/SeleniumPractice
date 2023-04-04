package Encapsulation;

class demo2 {
	private int pincode = 1104;
	private double salary = 3987.000;
	private char grade = 'A';

	public int getpincode() {
		return pincode;
	}

	public double getsalary() {
		return salary;
	}

	public char getGrade() {
		return grade;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setSalary(double salary) {
		 this.salary = salary;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 p1 = new demo2();
		System.out.println(p1.getpincode());
		System.out.println(p1.getsalary());
		System.out.println(p1.getGrade());
		p1.setPincode(1112);
		p1.setSalary(6900.9800);
		p1.setGrade('B');
		System.out.println(p1.getpincode());
		System.out.println(p1.getsalary());
		System.out.println(p1.getGrade());

	}

}
