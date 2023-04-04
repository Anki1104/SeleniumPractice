package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("anki");
		a1.add("Anki");
		a1.add("preu");
		a1.add("pratha");
		a1.add("gayii");
		a1.add("sanii");
		System.out.println(a1);
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("akki");
		a2.add("pranu");
		System.out.println(a2);
		a2.add(new String("pratha"));
		System.out.println(a2);
		a1.retainAll(a2);
		System.out.println(a2);
		System.out.println("Using iterative elements after retaining the elements of a2");
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			List l1 = new ArrayList();
			l1.add("pune");
			l1.add("Banglore");
			l1.add(143);
			l1.add(true);
			l1.add("pune");
			l1.add(null);
			System.out.println(l1);
		}

	}

}
