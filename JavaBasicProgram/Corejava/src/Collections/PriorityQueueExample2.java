package Collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(12);
		q1.add(70);
		q1.add(35);
		q1.add(90);
		q1.add(10);
		System.out.println("The elements between queue: " + q1);
		System.out.println("using poll removing the top most element: " + q1.poll());
		System.out.println(q1);
		System.out.println("the size of the queue is :" + q1.size());
		System.out.println("using remove () removing the top most element:" + q1.remove());
		System.out.println("print the queue after removing the element" + q1);

	}

}
