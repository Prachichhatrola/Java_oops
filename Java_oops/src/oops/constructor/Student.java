package oops.constructor;

// A copy constructor is a constructor that creates a new object by copying the values of another object of the same class.
public class Student {
	int id;
	String name;

	// Normal constructor
	Student(int i, String n) {
		id = i;
		name = n;
	}

	// Copy constructor
	Student(Student s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Prachi"); // original object
		Student s2 = new Student(s1); // copying s1 into s2 using copy constructor

		s1.display();
		s2.display();
	}
}
