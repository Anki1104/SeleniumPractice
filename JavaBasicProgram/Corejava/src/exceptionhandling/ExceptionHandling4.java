package exceptionhandling;

public class ExceptionHandling4 {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.out.println("program starts");
		setSleep(2000);
		checkNumber(-1);
		System.out.println("Hello Geeks");
	}

	static void setSleep(long time) throws InterruptedException {
		Thread.sleep(time);
	}

	static void checkNumber(int num) throws Exception  {
		if (num < 0) {
			throw new Exception("Number less dn zero");
		} else {
			System.out.println("Number is :" + num);
		}
	}
}