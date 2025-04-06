package oops.Loop;

public class LoopingExample {
	public static void main(String[] args) {
		System.out.println("1. For Loop:");
		// When you know the exact count
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("\n2. While Loop:");
		int j = 1;
		// Loop until condition is true
		while (j <= 5) {
			System.out.println("j = " + j);
			j++;
		}

		System.out.println("\n3. Do-While Loop:");
		int k = 1;
		// 	Runs at least once
		do {
			System.out.println("k = " + k);
			k++;
		} while (k <= 5);

		System.out.println("\n4. For-Each Loop:");
		int[] numbers = { 10, 20, 30, 40, 50 };
		// Used with arrays or collections
		for (int num : numbers) {
			System.out.println("Number = " + num);
		}

		System.out.println("\n5. Using Break and Continue:");
		for (int x = 1; x <= 10; x++) {
			if (x == 4) {
				System.out.println("Skipping 4 using continue");
				// Skip current iteration
				continue; // skip 4
			}
			if (x == 8) {
				System.out.println("Breaking at 8 using break");
				// Exit loop early
				break; // stop loop at 8
			}
			System.out.println("x = " + x);
		}
	}
}
