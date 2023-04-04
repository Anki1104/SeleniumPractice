package This;

public class NonStaticGlobalVariable {
	int empId = 101;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobalVariable n1 = new NonStaticGlobalVariable();
		n1.display();
	}

	void display() {
		int empId = 202;
		System.out.println("im the local empId: " + empId);
		System.out.println("im the global empId:" +this.empId);
	}
}
