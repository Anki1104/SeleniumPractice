package InheritanceExample;
class A{
	static int a = 10;
	int b = 20;
	double c = 13.46;
}
class B{
	static int x = 30;
	int y = 40;
	double z = 53.45;
}
class C{
	static int p = 50;
	int q = 59;
	double r = 34.09;
}
public class Inheritance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("class A static variable:" +A.a);
System.out.println("class B static variable:" +B.x);
System.out.println("class A static variable:" +C.p);
A a1 = new A();
System.out.println("class A  non static variable:" +a1.b);
System.out.println("class A  non static variable:" +a1.c);
B b1 = new B();
System.out.println("class B  non static variable:" +b1.y);
System.out.println("class B non  static variable:" +b1.z);
C c1 = new C();
System.out.println("class c non static variable:" +c1.q);
System.out.println("class c non  static variable:" +c1.r);	
	}
	
}
