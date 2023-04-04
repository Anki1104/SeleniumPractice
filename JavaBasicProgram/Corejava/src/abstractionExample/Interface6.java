package abstractionExample;
interface Animal0 {
	int age=20;
	public void animalSound(); 
	public void sleep(); 
}
class Pig7 implements Animal0 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
class Interface6 {

	public static void main(String[] args) {
		Pig7 myPig = new Pig7(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		System.out.println(Animal0.age);
	
	}

}
