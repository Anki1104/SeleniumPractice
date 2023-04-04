package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("Traversing array using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("Travering array using for each loop");
		}
		for (Object fruit : list) {
			System.out.println(fruit);
			list.set(1, "dates");
			System.out.println("size of list: " + list.size());
			System.out.println("Element of ArrayList:" + list);
		}
		Collections.sort(list);
		System.out.println("Size of list :" + list.size());
		System.out.println("Element of ArrayList:" + list);
		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		System.out.println("*********with used Iterator Object**********");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
