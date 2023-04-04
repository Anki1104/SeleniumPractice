package Assignment_2;

public class StaticMethodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi iam ankita");
		System.out.println("im a software tester");
		displayPersonalInfo();
		displayPersonalInfo();
//when you want to display a dynamic value
		displayPersonalInfo("gayii", "engineer", "wani");
		displayPersonalInfo("prerna", "dancer", "wani");
//execute calling method
		calling(123456);
		calling(9876542);
		int i = 6568983;
		calling(i);
		displayPersonalInfo( "ankita", "artist", "pune");
	}

	public static void displayPersonalInfo() {
		System.out.println("hi iam ankita");
		System.out.println("im a software tester");
	}

	public static void displayPersonalInfo(String name,  String prof, String location) {
		System.out.println("Hi, I am " + name);
		System.out.println("I am your " + prof + "  trainer");
		System.out.println("I am from " + location);
	}

	public static void calling(int num) {
		System.out.println("Hi, I am xyz");
		System.out.println("calling using number: " + num);
	}

}
