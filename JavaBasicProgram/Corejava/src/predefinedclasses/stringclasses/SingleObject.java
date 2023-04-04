package predefinedclasses.stringclasses;

public class SingleObject {
	int age = 49;

	private SingleObject() {
		System.out.println("sampleton class cons");

	}

	public static SingleObject SingleObj = new SingleObject();

	public static SingleObject getSampletonObject() {
		return SingleObj;

	}

	public void display(int num) {
		System.out.println("I am display()");
		age = num;
	}
}

class Demo{
	public static void main(String[] args) {
		SingleObject s1 = SingleObject.getSampletonObject();
		System.out.println(s1.age);
		s1.display(30);
		SingleObject s2 = SingleObject.getSampletonObject();
		System.out.println(s2.age);
		s2.display(35);
		System.out.println(s2.age);
		System.out.println(s1.age);
	}
}