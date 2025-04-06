package oops.structure;

//Class
public class Car {
 String brand;
 int year;

 // Constructor
 Car(String b, int y) {
     brand = b;
     year = y;
 }

 // Method
 void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Object creation
     Car myCar = new Car("Toyota", 2020);

     // Calling method using object
     myCar.displayDetails();
 }
}

