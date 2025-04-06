package oops.constructor;

public class noArgument {
	String name;

	// No Argument constructor
	public noArgument() {
	    name = "Programiz";
	  }
}

class Main {
	public static void main(String[] args) {

		// object is created in another class
		noArgument obj = new noArgument();
		System.out.println("Company name = " + obj.name);
	}
}
