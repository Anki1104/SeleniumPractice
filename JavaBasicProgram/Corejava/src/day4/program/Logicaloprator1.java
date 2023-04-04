package day4.program;

public class Logicaloprator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 30, num2 = 30;
boolean bool1 = (num1 == num2);
boolean bool2 = (num1>num2);
//logical And
System.out.println("bool1 && bool2 = "+(bool1 && bool2));
//Logical OR
System.out.println("bool1 || bool2 = "+(bool1 ||bool2));
//logical Not
System.out.println("!(bool1 && bool2= "+ !(bool1 &&bool2));
	}

}
