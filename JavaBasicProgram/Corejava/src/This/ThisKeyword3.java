package This;

class Student002 {
	int rollno;
	float fee;

	Student002(int rollno, float fee) {
		System.out.println("Local varibale: " + rollno);
		System.out.println("Local varibale: " + fee);
		System.out.println("Global varibale: " + this.rollno);
		System.out.println("Global varibale: " + this.fee);
		// global variable = local variable
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local varibale: " + rollno);
		System.out.println("Local varibale: " + fee);
		System.out.println("Global varibale: " + this.rollno);
		System.out.println("Global varibale: " + this.fee);
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

class ThisKeyword3 {
	public static void main(String args[]) {

		Student002 s1 = new Student002(111, 5000f);
		s1.display();//
		System.out.println("********************************");
		Student002 s2 = new Student002(112, 6000f);
		s2.display();//
	}
}