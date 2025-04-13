package Collection.Map;

import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		System.out.println("HashMap: " + map);

		map.remove("Banana");
		System.out.println("After removal: " + map);

		System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));
		System.out.println("Size: " + map.size());
	}
}

//Map stores key-value pairs, where keys are unique, and values can be duplicated.
