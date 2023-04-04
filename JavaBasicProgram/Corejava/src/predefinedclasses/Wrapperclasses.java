package predefinedclasses;

public class Wrapperclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Integer k = new Integer(a);
		Integer l = new Integer(20);
		Integer j = l;
		System.out.println("a: " + a + "\nk: " + k + "\nl: " + l + "\nj: " + j);
		System.out.println("***Unboxing of boxed object*****");
        //Converting Integer to int    
		Integer a1 = new Integer(25);
		int i1 = a1.intValue();// converting Integer to int explicitly
		System.out.println("a1: " + a1 + "\ni1: " + i1);

		System.out.println("a1==i1 : " + (a1 == i1));
		System.out.println("a1.equals(i1) : " + a1.equals(i1));

	}

}
