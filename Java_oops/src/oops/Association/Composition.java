package oops.Association;

//Engine class (tightly bound to Car)
class Engine {
	Engine() {
		System.out.println("Engine is ready");
	}
}

//Car has-a Engine (composition)
class Car1 {
	Engine engine;

	Car1() {
		engine = new Engine(); // Created within Car
	}

	void startCar() {
		System.out.println("Car is ready to go!");
	}
}

public class Composition {
	public static void main(String[] args) {
		Car1 car = new Car1(); // Engine is created automatically
		car.startCar(); // Output: Engine is ready \n Car is ready to go!
	}
}

//Composition – "has-a" (cannot exist independently)
//Child class object cannot live without the parent.
//Car has-a Engine.
//Composition uses tight coupling.
//Engine cannot exist without Car.


