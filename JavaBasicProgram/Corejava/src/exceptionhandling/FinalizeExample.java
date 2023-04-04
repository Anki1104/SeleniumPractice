package exceptionhandling;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeExample f2 = new FinalizeExample();
		System.out.println(f2.hashCode());
		f2 = null;
		Object objh;
		System.gc();
		System.out.println("program ends");

	}

	public void finalize() {
		System.out.println("Hi  i am finalize method");
	}

}
