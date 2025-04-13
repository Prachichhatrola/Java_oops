package Collection.Queue;

import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(20);
		queue.add(10);
		queue.add(30);

		System.out.println("PriorityQueue: " + queue);

		queue.poll();
		System.out.println("After poll: " + queue);
	}
}

//PriorityQueue orders elements based on their natural order or a comparator.