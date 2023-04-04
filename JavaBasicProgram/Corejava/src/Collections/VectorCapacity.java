package Collections;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vet = new Vector<String>();
		System.out.println(vet.capacity());
		System.out.println(vet.size());
		vet.setSize(2);
		System.out.println("Vector Size: " + vet.size());//
		System.out.println("Vector elements: " + vet);
		vet.addElement("Sunday");
		vet.addElement("Monday");
		System.out.println("after addition, Vector elements: " + vet);
		System.out.println("after add, Vector Size: " + vet.size());//
		vet.addElement("Wednesday");
		System.out.println("After addElement, Vector Size: " + vet.size());//
		System.out.println("Vector Capacity: " + vet.capacity());//
	}
}
