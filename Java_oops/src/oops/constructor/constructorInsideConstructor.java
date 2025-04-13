package oops.constructor;

class Student1 {
	String name;
	int age;

	// Constructor 1
	Student1() {
		this("Unknown", 0); // calling Constructor 2
		System.out.println("Default constructor called");
	}

	// Constructor 2
	Student1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Parameterized constructor called");
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class constructorInsideConstructor {
	public static void main(String[] args) {
		Student1 s1 = new Student1(); // Calls constructor 1 -> constructor 2
		Student1 s2 = new Student1("Prachi", 21); // Calls constructor 2 directly

		s1.display();
		s2.display();
	}
}
