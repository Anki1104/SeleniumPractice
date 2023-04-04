package InterviewQuestion;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java,selenium,testng, maven,genkins";
		String[] s1 = str.split(",");
		for (String s : s1) {

			System.out.println("print the all split string: " + s);
		}
	}
}
