package InheritanceExample;
class fruits{
	int fruitAge;
	fruits(){
		System.out.println("fruit class cons..");
		fruitAge =7;
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}
class orange extends fruits{
	int fruitAge;
	orange(){
		System.out.println("orange class cons..");
		fruitAge =5;
	}
	public void taste() {
		System.out.println("oranges are sweet");
	}
	public void shape() {
		System.out.println("oranges is round");
		System.out.println("orange fruitAge:" +super.fruitAge);
	taste();
	super.taste();
	}
}
public class Inheritance7 {

	public static void main(String...args) {
		// TODO Auto-generated method stub
orange o1 = new orange();
o1.shape();
	}

}
