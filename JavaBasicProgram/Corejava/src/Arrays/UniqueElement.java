package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(80);
		list.add(10);
		list.add(20);
		list.add(45);
		System.out.println("print the original element of the arrayList:" + list);
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println("print the unique element of the array list:" + set);
	}

}
