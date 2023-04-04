package InterviewQuestion;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ram";
		System.out.println("The original string is :" + s);
		StringBuffer sf = new StringBuffer(s);
		sf.reverse();
		System.out.println("Print the reverse string: " + sf);
	}

}
