package oops.DataTypes;

public class DataTypesExample {
	public static void main(String[] args) {

		// ===== Primitive Data Types =====

		// 1. Integer types
		byte a = 100; // 1 byte
		short b = 30000; // 2 bytes
		int c = 100000; // 4 bytes
		long d = 10000000000L; // 8 bytes (use 'L' at the end)

		// 2. Floating point types
		float e = 10.5f; // 4 bytes (use 'f' at the end)
		double f = 20.123456; // 8 bytes

		// 3. Character type
		char g = 'P'; // 2 bytes (stores single character)

		// 4. Boolean type
		boolean h = true; // 1 bit (true or false)

		// ===== Non-Primitive Data Types =====

		// 1. String (class type)
		String name = "Prachi";

		// 2. Array
		int[] marks = { 90, 85, 78 };

		// 3. Object of class
		Student s1 = new Student();
		s1.display();

		// ===== Output all primitive values =====
		System.out.println("Byte: " + a);
		System.out.println("Short: " + b);
		System.out.println("Int: " + c);
		System.out.println("Long: " + d);
		System.out.println("Float: " + e);
		System.out.println("Double: " + f);
		System.out.println("Char: " + g);
		System.out.println("Boolean: " + h);

		// ===== Output non-primitive values =====
		System.out.println("String: " + name);
		System.out.println("Array: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
	}
}

// Class for non-primitive object
class Student {
	void display() {
		System.out.println("This is a Student class object.");
	}
}
