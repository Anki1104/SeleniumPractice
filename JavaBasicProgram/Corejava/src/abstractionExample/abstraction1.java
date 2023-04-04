package abstractionExample;
abstract class shape {
	abstract void draw();
}
class Rectangle extends shape{
protected void draw() {
	System.out.println("drawing rectangle");
}
}
class Circle1 extends shape{
	public void draw() {
		System.out.println("drawing circle");
	}
	
}
 class abstraction1 {

	public static void main(String[] args) {
shape s = new Circle1();
s.draw();
shape s1 = new Rectangle();
s1.draw();
	}

}
