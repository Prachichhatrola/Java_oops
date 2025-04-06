package oops.ExceptionHandling;

public class ThrowThrowsExample {

	// Method that declares it might throw an exception
	public static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			// Explicitly throwing exception using 'throw'
			throw new ArithmeticException("Access denied - You must be 18+.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(16);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
