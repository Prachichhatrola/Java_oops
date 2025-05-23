package oops.Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ==========================
		// 1️. Array Declarations
		// ==========================

		int[] a; // Declaration only
		a = new int[3]; // Memory allocation

		int[] b = new int[4]; // Declaration + allocation
		int[] c = { 10, 20, 30 }; // Declaration + initialization
		int[] d;
		d = new int[] { 11, 22, 33, 44 }; // Separated init

		// ==========================
		// 2️. Traversing Arrays
		// ==========================

		System.out.println("\nArray c using normal for loop:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println("\n\nArray d using enhanced for-each loop:");
		for (int val : d) {
			System.out.print(val + " ");
		}

		// ==========================
		// 3️. User Input Example
		// ==========================

		int[] marks = new int[5];
		System.out.println("\n\nEnter 5 student marks:");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		// Display input using normal loop
		System.out.println("\nMarks using for loop:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + marks[i]);
		}

		// Display using for-each loop
		System.out.println("\nMarks using enhanced for-each loop:");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}

		// ==========================
		// 4️. Operations on Arrays
		// ==========================

		int sum = 0, max = marks[0], min = marks[0];
		for (int mark : marks) {
			sum += mark;
			if (mark > max)
				max = mark;
			if (mark < min)
				min = mark;
		}

		System.out.println("\n\nTotal Marks: " + sum);
		System.out.println("Highest Mark: " + max);
		System.out.println("Lowest Mark: " + min);

		Arrays.sort(marks); // Sorting
		System.out.println("Sorted Marks: " + Arrays.toString(marks));

		int searchIndex = Arrays.binarySearch(marks, 66); // Searching (if value exists)
		System.out.println("Index of 66 (if exists): " + searchIndex);

		// ==========================
		// 5️. 2D Array Example
		// ==========================

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println("\n2D Array (Matrix):");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
