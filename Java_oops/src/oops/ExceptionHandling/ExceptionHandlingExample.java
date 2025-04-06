package oops.ExceptionHandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		// Declare an array
		int[] numbers = { 10, 20, 30, 40 };

		// Try block to handle risky code
		try {
			int a = 10;
			int b = 0;

			// This will throw ArithmeticException (divide by zero)
			int result = a / b;
			System.out.println("Result: " + result);

			// This will throw ArrayIndexOutOfBoundsException
			System.out.println("Fifth Element: " + numbers[4]);

		} catch (ArithmeticException e) {
			// Catch block for arithmetic error
			System.out.println("Error: Cannot divide by zero!");

		} catch (ArrayIndexOutOfBoundsException e) {
			// Catch block for array index error
			System.out.println("Error: Array index is out of bounds!");

		} catch (Exception e) {
			// Generic catch block for any other exception
			System.out.println("General Error: " + e.getMessage());

		} finally {
			// This block always runs
			System.out.println("Finally block executed: Cleanup or closing resources if needed.");
		}

		System.out.println("Program continues after exception handling...");
	}
}
