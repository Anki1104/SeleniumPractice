package day6methods;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("Hello good morning");
			
		}
		for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		
		System.out.println("********************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(c1 + " ");
		}
		System.out.println("****************");
		for (char c1 = 'z'; c1 >= 'a'; c1--) {
			System.out.println(c1 + " ");

		}
	}
}
