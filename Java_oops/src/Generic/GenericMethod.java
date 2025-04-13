package Generic;

public class GenericMethod {
	public static <T> void printArray(T[] array) {
		for (T item : array)
			System.out.print(item + " ");
	}

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3 };
		String[] words = { "A", "B", "C" };
		printArray(nums); // Output: 1 2 3
		printArray(words); // Output: A B C
	}
}

//A method that can accept any type of parameter.
