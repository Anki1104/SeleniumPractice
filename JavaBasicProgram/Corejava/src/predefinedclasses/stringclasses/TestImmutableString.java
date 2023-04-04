package predefinedclasses.stringclasses;

final class TestImmutableString {
	final String name;
	final int salary;

	TestImmutableString(String s1, int num1) {
		name = s1;
		salary = num1;
	}

	public String getname() {
		return name;
	}

	public int getsalary() {
		return salary;
	}

	public static void main(String[] args) {
		TestImmutableString t1 = new TestImmutableString("Ankita", 90000);
		System.out.println(t1.getname());
		System.out.println(t1.getsalary());

		TestImmutableString t2 = new TestImmutableString("prerna", 80000);
		System.out.println(t2.getname());
		System.out.println(t2.getsalary());
	}
}
