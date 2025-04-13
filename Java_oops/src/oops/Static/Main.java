package oops.Static;

//Product class
class Product {
	String name;
	static int counter = 0; // shared among all products

	Product(String name) {
		this.name = name;
		counter++; // increment total product counter
		System.out.println("Product created: " + name);
	}
}

//Store class
class Store {
	int productCount = 0;

	void addProduct(String productName) {
		Product newProduct = new Product(productName);
		productCount++; // increment store's own count
		System.out.println("Product added to store. Store count: " + productCount);
	}
}

public class Main {
	public static void main(String[] args) {
		Store store1 = new Store();
		Store store2 = new Store();

		store1.addProduct("Laptop");
		store1.addProduct("Mouse");

		store2.addProduct("Keyboard");

		System.out.println("\nTotal Products Created (All Stores): " + Product.counter);
		System.out.println("Store1 Product Count: " + store1.productCount);
		System.out.println("Store2 Product Count: " + store2.productCount);
	}
}
