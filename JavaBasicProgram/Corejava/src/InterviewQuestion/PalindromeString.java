package InterviewQuestion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string using stringBuffer
		String s = "POP";
		String rev = " ";
		StringBuffer sf = new StringBuffer(s);
		sf.reverse();

		System.out.println("The given string is palindrom: " + s);
	}

}
