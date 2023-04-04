package Encapsulation;
class Student3 {
		private int pinCode = 411015;
		public void setPinCode(int pin) {
			 pinCode=pin;
		}
}
public class Example6 {

	public static void main(String[] args) {

		Student3 s = new Student3();
		s.setPinCode(12345);
		System.out.println("Bye");
	}
}
