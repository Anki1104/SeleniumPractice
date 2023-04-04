package InheritanceExample;
class testing10{
	void callingFromvoda() {
		System.out.println("vodaphone network busy ");
	}
}
class testing20 extends testing10{
	void callingFromIdea() {
		System.out.println("get Idea sir ji");
	}
}
 class testing30 extends testing20{
	 void callingFromAirtel() {
		 System.out.println("try everything");
	 }
 }
public class Example2 extends testing30{
void callingMe() {
	System.out.println("i am calling");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e1 = new Example2();
 e1.callingMe();
 e1.callingFromAirtel();            
 e1.callingFromIdea();
 e1.callingFromvoda();
 
 
	}

}
