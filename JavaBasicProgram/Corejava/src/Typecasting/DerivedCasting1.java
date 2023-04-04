package Typecasting;
class GrandParent{
	void myhome() {
		System.out.println("home belong to grand parent");
	}
}
class Parent extends GrandParent{
	void show() {
		System.out.println("parent show method is called");
	}
	void callme() {
		System.out.println("parent called method is called");
	}
}
class Child extends Parent{
	void readme() {
		System.out.println("child redme method is called");
	}
}
public class DerivedCasting1 {

		public static void main(String[] args) {
			System.out.println("*****Ref and Object both of child*****");
			Child c1=new Child();
			c1.readme();
			c1.callme();
			c1.show();
			c1.myhome();
			System.out.println("*****Ref and Object both of Parent*****");
			Parent p1=new Parent();
			p1.show();
			p1.callme();
			p1.myhome();
			System.out.println("******Ref and Object both of GrandParent*****");
			GrandParent g1=new GrandParent();
			g1.myhome();
			System.out.println("*******Ref parent and Object child*******");
			Parent obj = c1;
			obj.show();
			obj.callme();
			obj.myhome();
			System.out.println("******Ref GrandParent and Object of child*****");
			GrandParent g11=c1;
			g11.myhome();
	}

}
