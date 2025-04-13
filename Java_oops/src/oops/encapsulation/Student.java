package oops.encapsulation;

public class Student {
	// Private data member
	private String name;

	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setName("Prachi"); // Setting the name using setter
		System.out.println("Student name is: " + s1.getName()); // Getting the name using getter
	}
}
