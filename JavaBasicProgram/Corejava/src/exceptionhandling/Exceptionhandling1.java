package exceptionhandling;
import java. util .Scanner;
public class Exceptionhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program start here");

checkNumber(-1);
System.out.println("Hello geeks");
	}
	static void setSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    static void checkNumber(int num) {
    	if(num<0){
    		try {
				throw new Exception("Number less dn zero");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else {
    		System.out.println("Number is :"+num);
    	}
    }
}
