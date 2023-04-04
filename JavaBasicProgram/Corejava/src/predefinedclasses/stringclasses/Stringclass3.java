package predefinedclasses.stringclasses;

public class Stringclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "i am ankita , i am from wani, i have completed my bachelours";
		System.out.println(S1);
		String[] strAry = S1.split(" ");
		for (String s : strAry) {
			System.out.println(s);
		}
		String S2 = "I am form wani";
		System.out.println(S2);
		String[] strAry2 = S2.split(" ", 3);
		for (String s1 : strAry2) {
			System.out.println(s1);
		}
		String S3 = "i am from bangalore";
		System.out.println(S3);
		String[] str = S3.split(" ");
		String temp = " ";
		for (String s2 : str) {
			System.out.println(s2);

		}
		for (int i = str.length - 1; i >= 0; i--) {
			temp = temp + " " + str[i];
			System.out.println(temp);
			String s4 = "    Iam anki     ";
			System.out.println("Actual String with spaces: " + s4);
			System.out.println("Actual String length: " + s4.length());
			System.out.println("Actual String without spaces: " + s4.trim());
			System.out.println("Actual String length without spaces: " + s4.trim().length());
			System.out.println("***************************");
			String s5 = "   I am ankee    ";
			System.out.println("Actual String with spaces: " + s5.trim());
			System.out.println("Actual String length: " + s5.trim().length());

		}

	}

}
