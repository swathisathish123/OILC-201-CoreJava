package om.ojas.dataStructer;

import java.util.*;

class Priorityqueue {
	public static void main(String args[]) {
		PriorityQueue queue = new PriorityQueue();
		System.out.println("the elements are");
		queue.add("nani");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("santu");

//display queue
		System.out.println(queue);
//adding queue
		queue.add("reddy");
		System.out.println("after adding the elements are\n" + queue);
//removeing queue
		queue.remove();
		System.out.println("after removing the elements are\n" + queue);
//peek value
		System.out.println("peek value is\n" + queue.peek());
//poll value
		queue.poll();
		System.out.println("after poll value\n" + queue);
	}
}