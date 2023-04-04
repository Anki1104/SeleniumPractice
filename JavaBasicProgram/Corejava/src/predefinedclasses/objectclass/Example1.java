package predefinedclasses.objectclass;
class Demo{
	void display () {
		System.out.println(" iam display of class demo");
	}
}
 public class Example1 extends Demo{
	 static int last_roll = 100;
	 int roll_no;
	 Example1(){//constructor
		 roll_no = last_roll;
		 last_roll++;
	 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d1 =  new Demo();
System.out.println(d1);
Demo d3 =new Demo();
System.out.println(d3.toString());
Example1 s= new Example1();
System.out.println(s);
System.out.println(s.toString());
Demo d2 = new Demo();
System.out.println(d2);
System.out.println(new Example1());

	}
 }

