package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		// Sample list of numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1. filter() - Filters even numbers
		System.out.println("Even Numbers:");
		numbers.stream().filter(n -> n % 2 == 0) // Filters even numbers
				.forEach(System.out::println); // Terminal operation to print

		// 2. map() - Squares each number
		System.out.println("\nSquared Numbers:");
		List<Integer> squaredNumbers = numbers.stream().map(n -> n * n) // Squares each element
				.collect(Collectors.toList()); // Collects into a list
		System.out.println(squaredNumbers);

		// 3. collect() - Collects the result into a list
		System.out.println("\nCollected (Mapped) Numbers:");
		List<Integer> collectedNumbers = numbers.stream().map(n -> n * 2) // Maps each number to double its value
				.collect(Collectors.toList()); // Collects into a list
		System.out.println(collectedNumbers);

		// 4. distinct() - Removes duplicate numbers (if any)
		System.out.println("\nDistinct (Removing duplicates) Numbers:");
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
		numbersWithDuplicates.stream().distinct() // Removes duplicates
				.forEach(System.out::println);

		// 5. sorted() - Sorts numbers in ascending order
		System.out.println("\nSorted Numbers (Ascending):");
		numbers.stream().sorted() // Sorts the stream
				.forEach(System.out::println);

		// 6. sorted() with custom comparator - Sorts in descending order
		System.out.println("\nSorted Numbers (Descending):");
		numbers.stream().sorted((a, b) -> b - a) // Custom comparator for descending order
				.forEach(System.out::println);

		// 7. limit() - Limits the number of elements in the stream
		System.out.println("\nFirst 5 Numbers:");
		numbers.stream().limit(5) // Limits to first 5 elements
				.forEach(System.out::println);

		// 8. skip() - Skips the first 5 elements
		System.out.println("\nSkip First 5 Numbers:");
		numbers.stream().skip(5) // Skips first 5 elements
				.forEach(System.out::println);

		// 9. reduce() - Reduces to the sum of numbers
		System.out.println("\nSum of Numbers:");
		int sum = numbers.stream().reduce(0, Integer::sum); // Reduces the stream to a sum
		System.out.println("Sum: " + sum);

		// 10. forEach() - Prints all elements
		System.out.println("\nAll Numbers:");
		numbers.stream().forEach(System.out::println); // Prints each number in the stream
	}
}
