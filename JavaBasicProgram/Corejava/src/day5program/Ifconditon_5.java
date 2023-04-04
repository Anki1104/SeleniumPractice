package day5program;

public class Ifconditon_5 {
public static void main (String [] args) {
	 int year = 2000;
	 if((year %100 !=0)|| (year %400==0)) {
		 System.out.println("Leap year");
	 }else {
		 System.out.println("common year");
	 }
}
}
