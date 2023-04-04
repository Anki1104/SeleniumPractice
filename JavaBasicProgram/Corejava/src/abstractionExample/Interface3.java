package abstractionExample;
interface Printable{
	int age =30; 
	void print();
	}
interface showable{
	public void show();
	
}
public class Interface3 implements Printable ,showable{

	public static int age =45;
	public void print() {
		System.out.println("Hello print");
	}
	public void show() {
		System.out.println("welcome , show ");
}
	public static void main(String[] args) {
Interface3 obj = new Interface3();
obj.print();
obj.show();
System.out.println(Printable.age);
System.out.println(Interface3.age);
	}

}
