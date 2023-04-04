package Encapsulation;

class demo1 {
	private int ssn;
	private int empAge;

	public int getssn() {
		return ssn;
	}

	public int getempId() {
		return empAge;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 demo1 a1 = new demo1();
 System.out.println(a1.getempId());
 System.out.println(a1.getssn());
 a1.setSsn(101);
 a1.setEmpAge(45);
 System.out.println("************");
 System.out.println(a1.getempId());
 System.out.println(a1.getssn());
	}

}
