package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(3);
		list1.add(2);
		System.out.println("The unsorted array list is:" + list1);

		for (Integer myStr : list1) {
			System.out.print(" " + myStr);
		}

		// Collections.sort() are used to sort the List
		Collections.sort(list1);

		System.out.println("\nThe Sorted List is");

		for (Integer myStr : list1) {
			System.out.print(" " + myStr);
		}
	}

}
