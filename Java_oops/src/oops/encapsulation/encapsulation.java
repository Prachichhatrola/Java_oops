package oops.encapsulation;

class Programmer {
	private String name;

	// Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class encapsulation {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.setName("Prachi");
		System.out.println("Name: " + p.getName());
	}
}

// It is the process of wrapping data (variables) and methods that operate on the data into a single unit, 
//i.e., a class. Encapsulation is used to hide the internal implementation details of a class. 
// This technique ensures data protection, security, and flexibility in Java programming.

// Class = Single unit (data + logic)
// Use private to hide variables
// Use public getter/setter methods to access/update them safely

