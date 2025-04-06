package oops.variable;

public class instance_variable {

    // Instance variables
    String name;
    int age;

    // Constructor to initialize instance variables
    public instance_variable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information of a Person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of class Person
        instance_variable person1 = new instance_variable("Chaitanya", 37);
        instance_variable person2 = new instance_variable("Rahul", 35);

        // Calling the displayInfo method to print details of each instance
        person1.displayInfo();
        person2.displayInfo();
    }
}
