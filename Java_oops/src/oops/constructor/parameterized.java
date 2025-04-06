package oops.constructor;

public class parameterized {
	String languages;

	// constructor accepting single value
	parameterized(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  parameterized obj1 = new parameterized("Java");
		  parameterized obj2 = new parameterized("Python");
		  parameterized obj3 = new parameterized("C");
	  }
}
