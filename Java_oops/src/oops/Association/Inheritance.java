package oops.Association;

//Parent class (Superclass)
class Vehicle {
	String brand = "Ford";

	void start() {
		System.out.println("Vehicle is starting...");
	}
}

//Child class (Subclass) inherits from Vehicle
class Car extends Vehicle {
	String model = "Mustang";

	void display() {
		System.out.println("Brand: " + brand + ", Model: " + model);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Car c = new Car();
		c.start(); // Inherited method
		c.display(); // Child's own method
	}
}

//Inheritance – "is-a" relationship
//Car is-a Vehicle
//Inheritance promotes code reusability.
//Override or extend functionality in the subclass.