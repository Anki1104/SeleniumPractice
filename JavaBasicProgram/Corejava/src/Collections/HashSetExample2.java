package Collections;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("preu");
		list.add("jiya");
		list.add("anki");
		list.add("anke");
		System.out.println("List elements: " + list);

		HashSet<String> set = new HashSet<String>(list);
		System.out.println("Initial set elements: " + set);
		set.add("komal");
		System.out.println("set elements: " + set);
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("******************");
		set.forEach(s1 -> {
			System.out.println(s1);
		});
		System.out.println("***************");
		set.removeIf(s1 -> s1.contains("pratha"));
		System.out.println("set elements: " + set);
	}
}
