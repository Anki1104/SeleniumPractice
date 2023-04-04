package abstractionExample;
abstract class RBIBank{
	abstract double getRateOfInterestForHomeLoan();
	final void loan() {
		System.out.println("As per RBI loan..");
	}
}
class SBI101 extends RBIBank{
	double getRateOfInterestForHomeLoan() {
		return 6.78;
	}
}
class PNB extends RBIBank{
	double getRateOfInterestForHomeLoan() {
		return 7.98;
	}
}
class abstraction2{

	public static void main(String[] args) {
PNB p1 = new PNB() ;
System.out.println("PNB rate of intrest is :" + p1.getRateOfInterestForHomeLoan()+"%");
	p1.loan();
	SBI101 s2 = new SBI101();
	System.out.println("SBI rate of intrest is :" + s2.getRateOfInterestForHomeLoan()+"%");
	s2.loan();
	RBIBank b1 = new SBI101();
	System.out.println("RBI reference but object of SBI ,rate of interest is :"+ b1.getRateOfInterestForHomeLoan()+ "%");
	RBIBank b2 = new PNB();
	System.out.println("RBI reference but object of SBI ,rate of interest is :"+ b2.getRateOfInterestForHomeLoan()+ "%");

	}
	

}
