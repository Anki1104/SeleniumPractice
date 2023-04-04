package Constructor;

class C{
	double i= 11.04;
	C(double j){
		System.out.println("Running class c constructor");
		i=j;
	}

}
public class Cons6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C c1 = new C(11.11);
    System.out.println(c1.i);
    C c2 = new C(11.12);
    System.out.println(c2.i);
	}

}
