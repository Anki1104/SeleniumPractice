package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(45);
		l1.add(78);
		l1.add(34);
		System.out.println(l1);
		System.out.println(l1.size());
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println("reversing the string :" + l1);
		Example8 e1 = new Example8();
		e1.display();
		List<Example8> l2 = new ArrayList<>();
		l2.add(new Example8());
		l2.add(e1);
		l2.get(0).display();
		l2.get(1).display();
	}

	void display() {
		System.out.println("Hi ia am display method");
	}

}
