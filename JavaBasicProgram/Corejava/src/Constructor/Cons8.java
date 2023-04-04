package Constructor;

class V{
	int i = 10;
	V() {
		System.out.println("Running Class A constructor..");
        i =23;
        
	}
}
public class Cons8 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		V a1 = new V();
		System.out.println("Class A global varibale i = " + a1.i);
		System.out.println("======================================");
		V a2 = new V();
		System.out.println("Class A global varibale i = " + a2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}

}
