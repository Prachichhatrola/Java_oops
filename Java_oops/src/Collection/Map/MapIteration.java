package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapIteration {
	public static void main(String[] args) {
		// Creating a sample Map
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		// 1. Using forEach method (Java 8+)
		System.out.println("Using forEach method:");
		map.forEach((key, value) -> System.out.println(key + ": " + value));

		// 2. Using entrySet() with for-each loop
		System.out.println("\nUsing entrySet() with for-each loop:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// 3. Using keySet() with for-each loop
		System.out.println("\nUsing keySet() with for-each loop:");
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

		// 4. Using values() with for-each loop
		System.out.println("\nUsing values() with for-each loop:");
		for (Integer value : map.values()) {
			System.out.println(value);
		}

		// 5. Using Iterator with entrySet()
		System.out.println("\nUsing Iterator with entrySet():");
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// 6. Using Streams with forEach
		System.out.println("\nUsing Streams with forEach:");
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}
}
