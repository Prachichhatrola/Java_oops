package oops.ReadymadeFunction;

import java.util.*;

public class ReadymadeFunctionExample {

	public static void main(String[] args) {

		// Scanner (Read input)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		// String class functions
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("Length: " + name.length());
		System.out.println("First character: " + name.charAt(0));
		System.out.println("Substring (0-3): " + name.substring(0, 3));

		// Math class functions
		int a = -25;
		System.out.println("Absolute: " + Math.abs(a));
		System.out.println("Max: " + Math.max(10, 20));
		System.out.println("Min: " + Math.min(10, 20));
		System.out.println("Power: " + Math.pow(2, 3));
		System.out.println("Square Root: " + Math.sqrt(49));

		// Arrays class functions
		int[] arr = { 5, 2, 9, 1, 7 };
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		System.out.println("Binary Search for 7: Index = " + Arrays.binarySearch(arr, 7));

		// Collections class functions
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		Collections.sort(fruits); // Sort alphabetically
		System.out.println("Sorted Fruits List: " + fruits);

		sc.close(); 
	}
}
