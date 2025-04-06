package oops.constructor;

class constructor {
	private String name;

	// constructor
	constructor() {   /* constructor name is same as class name */
		System.out.println("Constructor Called:");
		name = "Programiz";
	}

	public static void main(String[] args) {

		// constructor is invoked while creating an object of the Main class
		constructor obj = new constructor();
		System.out.println("The name is " + obj.name);
	}
}