package predefinedclasses;

public class Unboxingopreation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double DoubleObj = 289.09;
		System.out.println(DoubleObj);
		Double salary = DoubleObj.doubleValue();
		System.out.println(salary);
		System.out.println(salary == DoubleObj);
		Boolean b = true;
		boolean b1 = b.booleanValue();
		Character c1 = new Character('A');
		char c2 = c1.charValue();
		Integer i = 28;
		double d = i.intValue();
	}

}
