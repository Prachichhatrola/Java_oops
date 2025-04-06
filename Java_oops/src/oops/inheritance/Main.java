package oops.inheritance;

//Parent class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

//Child class (inherits from Animal)
class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks.");
	}
}

//Main class
public class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat(); // inherited method
		myDog.bark(); // own method
	}
}
