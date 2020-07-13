package collectionsFrameworkPractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// It is similar to HashMap but it is synchronized, the values store on the
		// basis of key-value pair
		// Key --> Object --> HashCode (32byte) --> value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Hugh");
		h1.put(2, "Selenium");
		h1.put(3, "Engineer");

		// How to clone / shallow copy
		Hashtable h2 = new Hashtable();

		h2 = (Hashtable) h1.clone();

		System.out.println("The Values from h1" + h1);
		System.out.println("The values from clone" + h2);
		System.out.println(h1.get(1));

		// How to clear/delete
		h1.clear();
		System.out.println("The Values from h1" + h1);
		System.out.println("The values from clone" + h2);

		// how to use contains value
		Hashtable description = new Hashtable();
		description.put("A", "Pretty");
		description.put("B", "Tall");
		description.put("C", "Model");

		if (description.containsValue("Pretty"))
			;
		System.out.println("Value is Found");

		// How to print all the values from Hashtable using -- Enumeration --- elements
		// ()
		Enumeration e = description.elements();
		System.out.println("\n Print the Values of Description");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}

		// How to get the values from Hashtable using -- entrySet() -- set of hashtable
		// values;

		System.out.println("\nPrint Values of Description using entrySet");

		Set s = description.entrySet();
		System.out.println(s);

		Hashtable st1 = new Hashtable();
		st1.put("A", "Pretty");
		st1.put("B", "Tall");
		st1.put("C", "Model");
		st1.put("C", "Model"); // This will not print because it should contain unique value only
		// Null key and null values are not allowed --> it will give you NULLPointer
		// Exception
		// But in HashMap it is allowed

		System.out.println("It will not print duplicate values" + st1);

		// How to compare or check the hashtable are equal or not

		if (description.equals(st1))
			System.out.println("Both are Equal");

		// How to get the value from a Key"
		System.out.println(st1.get("A"));

		// How to get the hashCode of Hashtable object
		System.out.println(" The HashCode value of st1 : " + st1.hashCode());

		// If you want define GENERICS:
		Hashtable<String, String> st3 = new Hashtable<String, String>();

	}

}
