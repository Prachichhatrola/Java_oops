package oops.Static;

// static block and static variables are executed in the order they are present in a program.

class staticVariable {
	// static variable
	static int a = m1();

	// static block
	static {
		System.out.println("Inside static block");
	}

	// static method
	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	// static method(main !!)
	public static void main(String[] args) {
		System.out.println("Value of a : " + a);
		System.out.println("from main");
	}
}

// When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level
