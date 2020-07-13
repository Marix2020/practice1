package collectionsFrameworkPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class implements MAP Interface
		// Extends AbstractMap
		// It contains only unique elements -- Store the Values - "Key-Value Pair" It does not allow duplicate value
		// It is not synchronized -- not thread safe

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "Quality Assurance");
		hm.put(3, "Automation");
		hm.put(4, "TestComplete");

		System.out.println(hm.get(3));
		System.out.println(hm.get(5)); // Please note that if not within the element, The result will be "NULL"

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		// How to remove the element
		hm.remove(1);
		System.out.println("\n" + hm + "*****" + " Printing after No.1 removed" + "\n");

		HashMap<Integer, EmployeeArrayListObject> emp = new HashMap<Integer, EmployeeArrayListObject>();
		EmployeeArrayListObject e1 = new EmployeeArrayListObject("Hugh", 51, "Maintenance");
		EmployeeArrayListObject e2 = new EmployeeArrayListObject("Jackson", 30, "Engineering");
		EmployeeArrayListObject e3 = new EmployeeArrayListObject("Mariz", 35, "QA");
		EmployeeArrayListObject e4 = new EmployeeArrayListObject("Alex", 40, "Admin");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);

		// How to Iterate or print all // Traverse the HashMap using for loop

		System.out.println("\"Employee Information\"");
		for (Entry<Integer, EmployeeArrayListObject> m : emp.entrySet()) {
			int key = m.getKey();
			EmployeeArrayListObject e = m.getValue();

			System.out.println(key + " " + e.name + " " + e.age + " " + e.dept);

		}

	}

}
