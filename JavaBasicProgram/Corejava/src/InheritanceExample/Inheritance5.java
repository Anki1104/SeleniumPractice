package InheritanceExample;
class A2{
	static int a=10;
	int b=20;
	double  c =13.87; 
}
class B2 extends A2{
	static int x=49;
	int y=39;
	double z =89.00;
}
class C2 extends B2{
	static int p=87;
	int q=67;
	double r=78.98;
}
public class Inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("class A1 static variable :" +A2.a);
System.out.println("class A1 static variable :" +B2.x);
System.out.println("class A1 static variable :" +C2.p);

	
	C2 c1=new C2();
	System.out.println("with class c refer :" +c1.b);
    System.out.println("With Class c refer: " +c1.c);
	System.out.println("With Class c refer: " +c1.q);
	System.out.println("With Class c refer: " +c1.r);
	System.out.println("With Class c refer: " +c1.y);
	System.out.println("With Class c refer: "+ c1.z);
	
	}
}
