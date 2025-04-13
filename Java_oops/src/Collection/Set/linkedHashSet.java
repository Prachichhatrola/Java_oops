package Collection.Set;

import java.util.LinkedHashSet;

public class linkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");

		System.out.println("LinkedHashSet: " + set);

		set.remove("Banana");
		System.out.println("After removal: " + set);
	}
}

//LinkedHashSet maintains insertion order and does not allow duplicates.
