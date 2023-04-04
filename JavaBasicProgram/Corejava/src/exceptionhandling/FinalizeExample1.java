package exceptionhandling;

public class FinalizeExample1 {
	public void finalize() throws Throwable {
		try {
			System.out.println("Inside the finalize method");
		} catch (Throwable e) {
			throw e;
		} finally {
			System.out.println("calling finalize method of the object class");
			super.finalize();
		}
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FinalizeExample1 f1 = new FinalizeExample1();
		f1.finalize();
		System.out.println("program ends here");
	}

}
