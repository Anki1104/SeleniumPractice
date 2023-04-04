package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("anki");
		set.add("ankee");
		set.add("preu");
		set.add("pratha");
		System.out.println("After invoking remove(object) method: " + set);
		System.out.println(set.size());
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing Ravi from set: " + set.remove("Ravi"));
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("yuvi");
		set1.add("riya");
		System.out.println("set1 elements: " + set1);
		set.addAll(set1);
		System.out.println("Updated List: " + set);
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);
		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("komi"));
		System.out.println("After invoking removeIf() method: " + set);
		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);
	}

}
