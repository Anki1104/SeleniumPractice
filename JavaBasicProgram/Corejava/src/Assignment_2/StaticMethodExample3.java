package Assignment_2;

public class StaticMethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 50, num2=30;
System.out.println("before swapping :"+ num1);
System.out.println("before swapping :"+ num2);
num1=num1+num2;//50+30=80-50=30
num2=num1-num2;//30-30=0=30
num1=num1-num2;//30-30=0=50
SwapTwoNumber(num1,num2);

	}
	public static void SwapTwoNumber( int num1 ,  int num2) {
		System.out.println("after swapping :"+ num1);
		System.out.println("after swapping :"+ num2);

	}

}
