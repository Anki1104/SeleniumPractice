package abstractionExample;

public interface DemoInterface {
void display();
}
class Demo13 implements DemoInterface{
	public void display() {
		System.out.println("I m anki");
	}
	public static void main(String[] args) {
Demo13 d1 = new Demo13();
d1.display();
	}

}
   