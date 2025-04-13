package Collection.List;

import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Dog");
		list.add("Cat");
		list.add("Elephant");

		System.out.println("LinkedList: " + list);
		list.removeFirst();
		System.out.println("After removal: " + list);

		list.addFirst("Lion");
		System.out.println("After adding first: " + list);
	}
}

//LinkedList allows insertion/removal at both ends and maintains order.