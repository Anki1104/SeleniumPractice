package abstractionExample;
interface Printable1{
	void print();
}
interface showable1{
	void print();
}
class Interface4 implements Printable1,showable1 {
public void print() {
	System.out.println("hiee");
}
	public static void main(String[] args) {
Interface4 p1 = new Interface4();
p1.print();
showable1 p2 = new Interface4();
p1.print();
Printable1 p3 = new Interface4();
p3.print();
	}

}
