package Arrays;

class Example0 {
	int age;
	double salary;

	Example0() {
		System.out.println("zero para");
	}

	Example0(int a) {
		age = a;
		System.out.println("int para");
	}

	Example0(double a) {
		salary = a;
		System.out.println("double para");
	}

	void calling() {
		System.out.println("calling age : " + age);
		System.out.println("calling age : " + salary);
	}
}

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example0 e1 = new Example0(12);
		Example0 e2 = new Example0(12.34);
		Example0 e3 = new Example0();
		e1.calling();
		e2.calling();
		e3.calling();

		int empId1 = 101, empId2 = 102, impId3 = 103;
		int[] empId = new int[3];
		empId[0] = 101;
		empId[1] = 102;
		empId[2] = 103;

		System.out.println("*******************************");
		Example0[] e = new Example0[3];
		e[0] = new Example0();
		e[1] = new Example0(15);
		e[2] = new Example0(25.36);

		e[0].calling();
		e[1].calling();
		e[2].calling();
	}
}