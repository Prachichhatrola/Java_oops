package oops.inheritance;

class Parent {
	void show() {
		System.out.println("This is Parent class");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("This is Child class");
	}
}

public class singleInheritance {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();
		obj.display();
	}
}
