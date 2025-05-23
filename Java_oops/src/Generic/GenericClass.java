package Generic;

class Box<T> {
	T value;

	Box(T value) {
		this.value = value;
	}

	T getValue() {
		return value;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Box<String> strBox = new Box<>("Hello");
		System.out.println(strBox.getValue()); // Output: Hello
	}
}

//Allows creating class that works with any data type.
