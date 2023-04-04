package Collections;

import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(890);
		queue.add(677);
		queue.add(786);
		queue.add(678);
		queue.add(567);
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println("Iterating  the queue using for each loop");
		for (Object obj : queue) {
			System.out.println(obj);
		}
		System.out.println("Iterating the queue using iteration");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
			System.out.println("Eleements of Queue: " + queue);
			System.out.println("removing element from Queue using remove(): " + queue.remove());
			System.out.println("Eleements of Queue: " + queue);
			System.out.println("removing element from Queue using poll(): " + queue.poll());
			System.out.println("Eleements of Queue: " + queue);
			System.out.println("after removing two elements:");
			Iterator itr2 = queue.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			System.out.println("*****");
			queue.forEach(obj -> {
				System.out.println(obj);
			});

		}
	}

}
