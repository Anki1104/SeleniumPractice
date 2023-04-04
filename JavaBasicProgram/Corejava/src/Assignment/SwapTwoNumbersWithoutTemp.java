package Assignment;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 20,num2 = 30, temp;
System.out.println("Num1: "+num1);
System.out.println("Num2 :"+num2);
temp = num1; 
num1=num2;
num2 = temp;
System.out.println("************");
System.out.println("After swapping, Num1:"+num1);
System.out.println("After swapping Num2:"+num2);
	}

}
