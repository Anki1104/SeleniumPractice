package Overriding;

class Animal6 {
	String color = "white of Black";
}
class Dog6 extends Animal6 {
	String color = "pink";
	void printColor() {
		System.out.println("Dog color is : "+color);
		System.out.println("Animal color is: "+super.color);
	}
}
class Overriding10 {
	public static void main(String args[]) {
		Dog6 d = new Dog6();
		d.printColor();
		String s1="12 servers";
		System.out.println(s1.matches(".+[\\s]servers"));
		System.out.println(s1.indexOf("Ankita"));
		String[]  str=s1.split("Ankita");
		
	}
}