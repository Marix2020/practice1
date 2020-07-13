package collectionsFrameworkPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3]; // static is fixed
		// dynamic array = ArrayList
		// 1. can contain duplicate values/elements
		// 2. maintains insertion order
		// 3. NOT Synchronized
		// 4. allows

		ArrayList ar = new ArrayList();

		ar.add(10);// 0
		ar.add(130);// 1
		ar.add(110);// 2
		ar.add(50);// 3
		ar.add(15);// 4

		System.out.println(ar.size());

		ar.add(20);
		ar.add(45);
		ar.add(75);
		ar.add(12.33);
		ar.add("Test");
		ar.add('G');
		ar.add(true);

		System.out.println(ar.size()); // size of array

		System.out.println(ar.get(6)); // to get the value on the basis of indexes

		// to print all the values from arraylist:
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

		// non generic vs. generic:

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Selenium");
		ar1.add(78);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Selenium");
		ar2.add("UFT");

		@SuppressWarnings("unused")
		ArrayList<E> ar3 = new ArrayList<E>(); //

		// EmployeeArrayListObject - Class  //// User Defined ArrayList
		EmployeeArrayListObject e1 = new EmployeeArrayListObject("Maricel", 30, "QA");
		EmployeeArrayListObject e2 = new EmployeeArrayListObject("Sultana", 27, "QC");
		EmployeeArrayListObject e3 = new EmployeeArrayListObject("Emma", 26, "Admin");
		EmployeeArrayListObject e4 = new EmployeeArrayListObject("Natalia", 22, "Acctg");

		// create arraylist
		ArrayList<EmployeeArrayListObject> ar4 = new ArrayList<EmployeeArrayListObject>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		ar4.add(e4);

		// iterator to traverse the values:

		Iterator<EmployeeArrayListObject> it = ar4.iterator();
		while (it.hasNext()) {
			EmployeeArrayListObject emp = it.next();

			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//***********
		//addALL()
		ArrayList <String> ar5 = new ArrayList <String>();
		ar5.add("dev");
		ar5.add("Java");
		ar5.add("JavaScript");
		
		ArrayList <String> ar6 = new ArrayList <String>();
		ar6.add("Selenium");
		ar6.add("Maven");
		ar6.add("UFT");
		
		ar5.addAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
			
		}
		
		System.out.println("**********");
		
		//removeAll;
		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
			
		}
		
		//retainAll()
		ArrayList <String> ar7 = new ArrayList <String>();
		ar7.add("dev");
		ar7.add("Java");
		ar7.add("JavaScript");
		
		ArrayList <String> ar8 = new ArrayList <String>();
		ar8.add("dev");
		ar8.add("Maven");
		
		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
			
		}
		
		
		
		
		
		
		

	}

}
