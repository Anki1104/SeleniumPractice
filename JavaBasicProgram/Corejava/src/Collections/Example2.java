package Collections;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		a1.add("anki");
		a1.add("preu");
		a1.add("rikki");
		System.out.println("After invoking add (E e)method " + a1);
		a1.add(1, "pratha");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add("rita");
		a2.add("gayii");
		System.out.println("After invoking add(E e )method " + a2);
		a1.addAll(a2);
		System.out.println("List al element after adding list a2" + a1);
		ArrayList a3 = new ArrayList();
		a3.add("shou");
		a3.add("sanni");
		System.out.println("print the value of a3" + a3);
		a1.addAll(a3);
		System.out.println("the value of a3 is" + a3);
		a3.add(1, "swami");
		System.out.println(a3);
	}

}
