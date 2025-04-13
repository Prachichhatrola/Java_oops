package oops.inheritance;

//Parent class
class Vehicle {
	String brand;
	String model;

	// Constructor of Vehicle
	Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
		System.out.println("Vehicle constructor called");
		System.out.println("Brand: " + brand + ", Model: " + model);
	}
}

//Child class
class Car extends Vehicle {
	int numberOfDoors;

	// Constructor of Car
	Car(String brand, String model, int numberOfDoors) {
		super(brand, model); // calling parent class constructor
		this.numberOfDoors = numberOfDoors;
		System.out.println("Car constructor called");
		System.out.println("Number of Doors: " + numberOfDoors);
	}
}

//Main class to test
public class superInConstructor {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", "Camry", 4);
	}
}
