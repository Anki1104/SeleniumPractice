package PracticeProgram;

public class PrimeNumberUsingWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,count= 0;
		int num = 7;
		System.out.println("Enter n value :"+ num);
		while(i<=num/2) {
			if(num% i ==0) {
				count++;
				
			}
			i++;
		}
		if(count==0) {
			System.out.println("number is prime Number");
		}else {
			System.out.println("The number is not prime number");
		}
}
}