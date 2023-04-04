package day4.program;

public class Unaryoprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 20;
int b = a;
System.out.println("a is = "+a);//20
System.out.println("b is = "+b);//20

//pre =first you perform the operation and then use the updated value
//post =first you use the value and then perform the operation

int k = ++a;
System.out.println("k is ="+k);//21
System.out.println("a is ="+a);//21
int j = k++;
System.out.println("k is ="+k);//22
System.out.println("j is ="+j);//21
int r = 21;
System.out.println("r is ="+ r++);//21
System.out.println("r is =" + ++r);//23
System.out.println("r is ="+r);//23
int p= 143;
System.out.println("p is =" + ++p);//143
System.out.println("p is ="+ p--);//143
System.out.println("p is ="+ p++);//142
System.out.println("p is ="+ --p);//142
	}

}
