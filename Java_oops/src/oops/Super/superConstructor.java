package oops.Super;

//Java Code to show use of super keyword with constructor 

//superclass Person 
class Person1 {
	Person1() {
		System.out.println("Person class Constructor");
	}
}

//subclass Student extending the Person class 
class Student1 extends Person1 {
	Student1() {
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	/*	super(); --> this gives compile error. because, Call to super() must be the first statement in the Derived Class constructor*/
	}
}

//Driver Program 
public class superConstructor {
	public static void main(String[] args) {
		Student1 s = new Student1();
	}
}
