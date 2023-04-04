package Assignment;

public class SwapTwoNumberWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num1 = 90,num2=30;
  System.out.println("Num1: "+num1);
  System.out.println("Num2: "+num2);
  
  num1=num1+num2;
  num2=num1-num2;
  num1=num1-num2;
  System.out.println("After swapping, Num1: "+num1);
  System.out.println("After swapping ,Num2: "+num2);
	}

}
