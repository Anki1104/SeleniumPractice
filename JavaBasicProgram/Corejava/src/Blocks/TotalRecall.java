package Blocks;

public class TotalRecall {
	//global variable -->static and non static variable
	
 static final int EmpId =101;
 static double salary;
static int age; 
//blocks--> static and non static
static {
	age =40;
	System.out.println("total recall static block");
	System.out.println(+age);
}
{
	//salary=8900.0;
	System.out.println("total recall non static block");
	System.out.println(salary);
}
//method or function
  static void display(){
System.out.println("i am static method display");
}
  public void print(int age, double salary) {
	  System.out.println("age" +  age  + " salary " + salary);
  }
  //constructor 
  TotalRecall(){
	  this(34, 876.90);
	  System.out.println("i am zero para constructor");
  }
  //constructor overloading
  TotalRecall(int age, double salary){
	  this.salary = 8900.0;
	  System.out.println("age " +  age  + " salary "  +  salary);
  }
  public static void main(String []args) {
	  System.out.println("main()starts");
	  System.out.println(EmpId);
	  TotalRecall t1 = new TotalRecall();
	  TotalRecall t2 = new TotalRecall(35  ,45000);
	  display();
	  t1.print(age,salary);////non static method call
	  t2.print(34,67900);
	  System.out.println("main()ends");
	  System.out.println(t2.salary);//by using this keyword
	  }
}