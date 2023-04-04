package Typecasting;

class parent100 {
	void myhome() {
		System.out.println("parent home");
	}
}

class child100 extends parent100 {
	void mycar() {
		System.out.println("child car");
	}
}

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent100 c1 = new parent100();
		c1.myhome();
		child100 c2 = new child100();
		c2.mycar();
		c2.myhome();
		System.out.println("********************");
//by using casting concept
		child100 c3 = new child100();
		c3.myhome();
		c3.mycar();
		parent100 c4 = c3;
		c4.myhome();
		parent100 p1 = new child100();
		parent100 p2 = (parent100) new child100();
		parent100 p3 = (parent100) c3;
	}

}
