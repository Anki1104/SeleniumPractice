package InheritanceExample;

class Company200 {
	void display() {
		System.out.println("I am company class display()...");
	}
}
// child class of Company
class Employee101 extends Company200 {
	void display() {
		System.out.println("I am Employee class display()...");
		super.display();
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		Employee101 e1=new Employee101();
		e1.display();
		e1.callme();
		System.out.println("***===***");
		Company200 c1=new Company200();
		c1.display();
		System.out.println("***===***");
		Company200 e2=new Employee101();
		e2.display();
	}
}