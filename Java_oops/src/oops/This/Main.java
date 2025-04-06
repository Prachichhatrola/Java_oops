package oops.This;

public class Main {
	  int x;

	  // Constructor with a parameter
	  public Main(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    Main myObj = new Main(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}

// The this keyword refers to the current object in a method or constructor.

//Refer more: https://www.geeksforgeeks.org/this-reference-in-java/
