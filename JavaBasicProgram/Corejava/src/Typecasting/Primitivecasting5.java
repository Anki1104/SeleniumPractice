package Typecasting;

class sample {
	void test1(double d) {
		System.out.println(d);
	}

	void test1(int k) {
		System.out.println(k);

	}
}

public class Primitivecasting5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s = new sample();
		s.test1(89.8);
	}
}
