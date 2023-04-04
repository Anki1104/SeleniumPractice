package Typecasting;

class member {
	long phone;

	void chat() {
		System.out.println("chatting in whatsapp group with " + phone);
	}
}

class Admin extends member {
	void addNumber() {
		System.out.println("adding a new user number in whatsapp group");
	}
}

public class DerivedCasting2 {

	public static void main(String[] args) {
		member m1 = new Admin();
		m1.phone = 783268264;
		m1.chat();
		Admin ad = (Admin) m1;
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);
	}

}
