package day4.program;

public class UnaryOprator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 55, b;
 b = a++;
 int x = a, y;
System.out.println(x);//56
 y = ++x;
 System.out.println(a);//56
 System.out.println(b);//55
 System.out.println(x);//57
 System.out.println(y);//57
 int p = -20, q = 30, res;
 res = p++ + --q;
 System.out.println("res : "+ res);//9
 System.out.println("p : "+ p);//-19
 System.out.println("q : "+q);//29
 
	}

}
