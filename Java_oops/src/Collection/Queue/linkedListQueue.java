package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");

		System.out.println("Queue: " + queue);

		queue.poll();
		System.out.println("After poll: " + queue);
	}
}
