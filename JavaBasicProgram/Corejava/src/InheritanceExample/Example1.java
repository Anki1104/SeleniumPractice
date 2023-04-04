package InheritanceExample;

class testing1 {
	void callingFromvoda() {
		System.out.println("vodaphone network busy");
	}
}

class testing2 {
	void callingFromIdea() {
		System.out.println("Get idea sir ji");
	}
}

class testing3 {
	void callingFromAirtel() {
		System.out.println("try everything");
	}
}

public class Example1 {
	void callingme() {
		System.out.println("i am calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1 = new Example1();
		e1.callingme();
		testing1 t1 = new testing1();
		t1.callingFromvoda();
		testing2 t2 = new testing2();
		t2.callingFromIdea();
		testing3 t3 = new testing3();
		t3.callingFromAirtel();
	}
}
