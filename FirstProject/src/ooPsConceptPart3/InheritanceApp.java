package ooPsConceptPart3;

// Textual Representation how an object will look like in the memory.
// Whatever we write in class is in actual the property of object as we are describing the object
// If you want anything which should belong to class make it static!!
class Product {

	// Attributes
	int productID;
	String name;
	int price;

	// Constructor
	Product() {
		System.out.println(">> Product Object Constructed");
	}

	// Methods (behavior)
	// To write data in Product Object - we have this method
	void setProductDetails(int productID, String name, int price) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		System.out.println(">> Data Written in Product Object");

	}

	// To read data from Product Object
	void showProductDetails() {
		System.out.println("--------Product ID:" + productID + "--------");
		System.out.println("Name:\t" + name);
		System.out.println("Price: \t" + price);
		System.out.println("---------------------------------------------");
	}

	// Setter
	void setproductID(int ProductID) {
		this.productID = productID; // this means reference to current object
		// Left side "productID" belongs to the object and right side "productID"
		// belongs to the method
	}

	// Getter (Note: Setter and getter method is required when the attribute marked
	// as private)
	// This is the way the get indirect
	int getproductID() {
		return productID;

	}
}

class Mobile extends Product {

	// Additional attributes of Mobile other than Product
	String os;
	int ram;
	int sdCardSize;

	Mobile() {
		System.out.println(" >> Mobile Object Constructed");

	}
// we have redefined the method from the parent into the child with different inputs
	// we have 2 methods - 1 from parent and 1 from child
	// both are different as in based on inputs (even though name is same)

	// Method Overloading = Same method name with different inputs//compile time polymorphism
	void setProductDetails(int productID, String name, int price, String os, int ram, int sdCardSize) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		System.out.println(">> Data Written in Product Object");
	}

	// redefined showProductDetails - here we have same inputs
	// 2 methods, 1 from parent, 1 in child and we have signatures!!
	// child methods will be executed and not the parent method
	
	//OVERRIDING METHOD : Same method Name with same inputs in Parent Child Relationship// runt time 
	void showProductDetails() {
		System.out.println("--------Product ID:" + productID + "--------");
		System.out.println("Name:\t" + name);
		System.out.println("Price: \t" + price);
		System.out.println("OS : \t" + os);
		System.out.println("RAM : \t" + ram);
		System.out.println("SDCArd :" + sdCardSize);
		System.out.println("---------------------------------------------");
	}
}

public class InheritanceApp {

// main is executed by JVM when the program will run!!
	public static void main(String[] args) {

		/*
		 * //Create an Object : Product Product product = new Product (); //product is
		 * not an object its a reference variable which holds the hashCode of the object
		 * in hexadecimal notation System.out.println("product is:" + product); // we
		 * get 15db9742 as a hashCode, so product is a reference variable not an object
		 * 
		 * //Writing data in object product.setProductDetails(1001, "iPhoneHj", 80000);
		 * 
		 * //Reading data from Object product.showProductDetails();
		 * 
		 * System.out.println();
		 * 
		 * //writing data directly Product product2 = new Product(); product2.productID
		 * = 2001; // error.. since attribute marked as private cannot be accessed!!
		 * product2.name = "Louis Vuitton"; product2.price = 60000;
		 * product2.showProductDetails();
		 * 
		 */

		// Requesting to get Mobile Object Constructed!!
		Mobile mobile = new Mobile();
		// Product Object gets constructed before the Mobile Object "" -> Rule of
		// Inheritance (Object to object)

//		mobile.setProductDetails(3001, "iPhoneJ", 90000);
//		mobile.showProductDetails();

		mobile.setProductDetails(3001, "iPhoneJ", 90000, "iOS", 4, 128);
		mobile.showProductDetails();

	}
}
