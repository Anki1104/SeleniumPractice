package Encapsulation;
class Student2 {
	private int pinCode = 411015;
	public int getPinCode() {
		return pinCode;
	}
}
public class Example5 {

	public static void main(String[] args) {

		Student2 s = new Student2();
		System.out.println(s.getPinCode());
	}
}
