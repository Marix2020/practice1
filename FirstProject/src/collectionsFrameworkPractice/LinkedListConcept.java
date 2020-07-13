package collectionsFrameworkPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add :
		ll.add("UFT");
		ll.add("Automation");
		ll.add("Testing");
		ll.add("Selenium");
		ll.add("QTP");

		// print
		System.out.println("Content of LinkedList:" + ll);

		// add first:
		ll.addFirst("Maricel");
		// add last:
		ll.addLast("Engineer");

		System.out.println("Content of LinkedList after modification" + ll);

		// get:
		System.out.println(ll.get(0));
		// set:
		ll.set(0, "Jackson");
		System.out.println(ll.get(0));

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		// how to remove on the specific element
		ll.remove(2);
		System.out.println(ll);

		// How to Iterate== or how to print all the values of LinkedList:
		// Using For Loop
		System.out.println("\n**** Using For Loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// Advance For Loop or For Each Loop
		System.out.println("\n**** Using FOR EACH LOOP");
		for (String string : ll) {
			System.out.println(string);
		}
		// Iterator
		System.out.println("\n**** Using Iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// While Loop
		System.out.println("\n*** Using While Loop");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;

		}

	}

}
