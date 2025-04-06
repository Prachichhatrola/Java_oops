package oops.abstraction;

//Abstract class
abstract class Shape {
	// Abstract method (no body)
	abstract void draw();

	// Non-abstract method
	void show() {
		System.out.println("This is a shape");
	}
}

//Subclass 1
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

//Subclass 2
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

public class abstraction {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.draw(); // Output: Drawing a Circle
		s1.show(); // Output: This is a shape

		Shape s2 = new Rectangle();
		s2.draw(); // Output: Drawing a Rectangle
	}
}

// Abstraction is the process of hiding the implementation details and only showing the essential functionality or features to the user. 
