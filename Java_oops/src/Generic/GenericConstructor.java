package Generic;

class Printer1 {
	<T> Printer1(T value) {
		System.out.println("Value: " + value);
	}
}

public class GenericConstructor {
	public static void main(String[] args) {
		Printer1 p1 = new Printer1(123); // Output: Value: 123
		Printer1 p2 = new Printer1("Generic"); // Output: Value: Generic
	}
}

//Constructor with generic parameter.