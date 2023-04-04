package InterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ankita";
		System.out.println("Actual string is :" + s);
		String rev = " ";
		int len = s.length();// string are immutable in nature that why we can not have a reverse method
//using for loop
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("The reverse string is :" + rev);
//using string buffer
		StringBuffer sf = new StringBuffer(s);
		sf.reverse();// string buffer are mutable in nature thats why we can use reverse method in
						// string buffer
		System.out.println(sf);
	}

}
