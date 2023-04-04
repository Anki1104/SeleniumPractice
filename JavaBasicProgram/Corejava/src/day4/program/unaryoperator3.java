package day4.program;

public class unaryoperator3 {

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
		 int p = -10, q = 20, res;
		 res = p++ + --q;
		 System.out.println("res : "+ res);//9
		 System.out.println("p : "+ p);//-9
		 System.out.println("q : "+q);//19
		 res = ++p + ++q;
		 System.out.println("res : "+ res);//9
		 System.out.println("p : "+ p);//-9
		 System.out.println("q : "+q);//19
			}
}
