package Arrays;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class AddListintoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aList = Arrays.asList("Ankita", "for", "testing job", "Techmahindra", "company");

		Set<String> hSet = new HashSet<String>();
		for (String x : aList)
			hSet.add(x);

		System.out.println("Created HashSet is");
		for (String x : hSet)
			System.out.println(x);

	}

}
