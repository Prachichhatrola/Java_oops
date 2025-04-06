package oops.inheritance;

class Grandparent {
	void grand() {
		System.out.println("This is Grandparent class");
	}
}

class Parent1 extends Grandparent {
	void parent() {
		System.out.println("This is Parent class");
	}
}

class Child1 extends Parent1 {
	void child() {
		System.out.println("This is Child class");
	}
}

public class multilevelInheritance {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.grand();
		obj.parent();
		obj.child();
	}
}
