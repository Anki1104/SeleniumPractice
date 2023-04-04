package Collections;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		ArrayList<Boolean> list1 = new ArrayList<>();
		list1.add(true);
		ArrayList<Character> list2 = new ArrayList<>();
		list2.add('A');
		// using generic way
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Anki");
		s1.add("preu");
		s1.add("pratha");
		s1.add("gayii");
		s1.add("sanii");
		System.out.println(" initial list of string element: " + s1);
		s1.set(1, "Aries");
		System.out.println(s1);
		System.out.println(s1.remove(1));
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("shou");
		s2.add("baby");
		s2.add("akkii");
		System.out.println(s2);
		s1.addAll(s2);
		System.out.println(s1);
		s1.removeIf(str -> str.contains("akkii"));
		System.out.println(s1);

	}

}
