package abstractionExample;
interface Printable2{
	void print();
}
interface showable2 extends Printable2{
	void show();
}

class Interface5 implements showable2 {
public void print() {
	System.out.println("hey");
}
public void show() {
	System.out.println("congrats");
}
	public static void main(String[] args) {
Interface5 obj = new Interface5();
obj.print();
obj.show();
Printable2 obj2 = new Interface5();
obj2.print();
System.out.println("*************");
showable2 obj3 = new Interface5();
obj3.print();
obj3.show();
	}

}
