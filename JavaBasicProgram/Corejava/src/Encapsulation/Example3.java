package Encapsulation;

class Account1{
	private long Acc_no;
	private float Amount;

	public long getAcc_no() {
		return Acc_no;

	}

	public float Amount() {
		return Amount;
	}

	public void setAcc_no(long Acc_no) {
		this.Acc_no = Acc_no;
	}

	public void setAmount(float Amount) {
		this.Amount = Amount;
	}
}

public class Example3 { 
	public static void main(String[] args) {
	   Account1 b1 = new Account1();

		System.out.println(b1.getAcc_no());

		System.out.println(b1.Amount());
		b1.setAcc_no(7560504000L);
		b1.setAmount(500000f);
		System.out.println(b1.Amount());
		System.out.println(b1.getAcc_no());
		System.out.println("**************************");
		Account1 b2 = new Account1();
		System.out.println("Account  number using new object: " + b2.getAcc_no());
		System.out.println("Amount using new Object: " + b2.Amount());
	}
}
