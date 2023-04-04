package Pedefinedclasses.Scannerclass;

public class SystemDemo {
	public static void main(String args[]) {
		System.out.println("System User Dir: " + System.getProperty("user.home"));
		System.out.println("Current Working Dir: " + System.getProperty("user.dir"));
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));// null
		System.setProperty("user.home", "F:\\GitAutomation\\MorningBatch1");
		System.out.println("updated System User Dir: " + System.getProperty("user.home"));
		System.setProperty("user.country", "IND");
		System.out.println(System.getProperty("user.country"));// IND

		System.out
				.println("other than system property: " + System.getProperty("user.password", "none of your business"));

		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());

		System.out.println(System.getProperty("java.home"));
	}
}
