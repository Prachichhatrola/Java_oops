package oops.operators;

public class AllOperatorsExample {
	public static void main(String[] args) {

		// 1. Arithmetic Operators (+, -, *, /, %)
		int a = 10, b = 3;
		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = " + (a + b)); // 13
		System.out.println("a - b = " + (a - b)); // 7
		System.out.println("a * b = " + (a * b)); // 30
		System.out.println("a / b = " + (a / b)); // 3
		System.out.println("a % b = " + (a % b)); // 1

		// 2. Relational (Comparison) Operators (==, !=, >, <, >=, <=)
		System.out.println("\nRelational Operators:");
		System.out.println("a == b: " + (a == b)); // false
		System.out.println("a != b: " + (a != b)); // true
		System.out.println("a > b: " + (a > b)); // true
		System.out.println("a < b: " + (a < b)); // false
		System.out.println("a >= b: " + (a >= b)); // true
		System.out.println("a <= b: " + (a <= b)); // false

		// 3. Logical Operators (&&, ||, !)
		boolean x = true, y = false;
		System.out.println("\nLogical Operators:");
		System.out.println("x && y: " + (x && y)); // false
		System.out.println("x || y: " + (x || y)); // true
		System.out.println("!x: " + (!x)); // false

		// 4. Bitwise Operators (&, |, ^, ~, <<, >>)
		int m = 5, n = 3;
		System.out.println("\nBitwise Operators:");
		System.out.println("m & n = " + (m & n)); // 1
		System.out.println("m | n = " + (m | n)); // 7
		System.out.println("m ^ n = " + (m ^ n)); // 6
		System.out.println("~m = " + (~m)); // -6
		System.out.println("m << 1 = " + (m << 1)); // 10
		System.out.println("m >> 1 = " + (m >> 1)); // 2

		// 5. Assignment Operators (=, +=, -=, *=, /=, %=)
		int num = 10;
		System.out.println("\nAssignment Operators:");
		num += 5; // num = num + 5
		System.out.println("num += 5: " + num);
		num -= 3;
		System.out.println("num -= 3: " + num);
		num *= 2;
		System.out.println("num *= 2: " + num);
		num /= 4;
		System.out.println("num /= 4: " + num);
		num %= 3;
		System.out.println("num %= 3: " + num);

		// 6. Unary Operators (++ -- + -)
		int value = 5;
		System.out.println("\nUnary Operators:");
		System.out.println("value++: " + (value++)); // 5
		System.out.println("++value: " + (++value)); // 7
		System.out.println("value--: " + (value--)); // 7
		System.out.println("--value: " + (--value)); // 5
		System.out.println("+value: " + (+value)); // 5
		System.out.println("-value: " + (-value)); // -5

		// 7. Ternary Operator (condition ? trueValue : falseValue)
		int age = 20;
		String result = (age >= 18) ? "Adult" : "Minor";
		System.out.println("\nTernary Operator:");
		System.out.println("You are: " + result);
	}
}
