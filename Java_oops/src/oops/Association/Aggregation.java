package oops.Association;

//Address class (can exist alone)
class Address {
	String city = "Ahmedabad";
	String state = "Gujarat";
}

//Person class has-a Address (aggregation)
class Person {
	String name = "Prachi";
	Address address; // Reference to another class

	Person(Address address) {
		this.address = address;
	}

	void displayInfo() {
		System.out.println(name + " lives in " + address.city + ", " + address.state);
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Address addr = new Address(); // Address can exist without Person
		Person p = new Person(addr); // Inject Address object
		p.displayInfo(); // Output: Prachi lives in Ahmedabad, Gujarat
	}
}

//Aggregation – "has-a" (can exist independently)
//Child class object can live independently of the parent.
//Person has-a Address.
//Aggregation uses loose coupling.
//Both can exist independently.
