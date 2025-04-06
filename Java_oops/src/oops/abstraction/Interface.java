package oops.abstraction;

//Interface
interface Animal {
	void sound(); // abstract method
}

//Class implementing the interface
class Dog implements Animal {
	public void sound() {
		System.out.println("Dog barks");
	}
}

//Another class implementing the same interface
class Cat implements Animal {
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class Interface {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.sound(); // Output: Dog barks

		Animal a2 = new Cat();
		a2.sound(); // Output: Cat meows
	}
}

// Interfaces are another method of implementing abstraction in Java. The key difference is that, by using interfaces, we can achieve 100% abstraction in Java classes.
// Interfaces support multiple inheritance in Java.
// Methods in interfaces are implicitly public and abstract (unless default or static).
// A class must implement all methods of an interface, or be declared abstract.


