package predefinedclasses;

public class BoxingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		Character charObj = new Character(c1);
		System.out.println(c1 == charObj);
		Character charobj2 = new Character('Z');
		Character charobj3 = 'H';
		System.out.println(charObj);
		System.out.println(charobj2);
		System.out.println(charobj3);
		boolean b = true;
		Boolean b1 = new Boolean(b);
		System.out.println(b1 == b);

	}

}
