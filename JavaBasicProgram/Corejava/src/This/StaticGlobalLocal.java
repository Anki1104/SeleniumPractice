package This;

public class StaticGlobalLocal {

	static int age = 25;

	public static void main(String[] args) {
		int age = 30;
		System.out.println("I am local age: " + age);
		System.out.println("I am global age: " + StaticGlobalLocal.age);
	}
}
