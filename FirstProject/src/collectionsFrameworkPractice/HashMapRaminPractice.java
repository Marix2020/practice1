package collectionsFrameworkPractice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapRaminPractice {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		
		
		HashMap<Integer,ArrayList<Integer>> arraylist =new HashMap<Integer,ArrayList<Integer>>(); 
		
		arraylist.put(0001, list);
		arraylist.put(0002, list2);
		
		System.out.println(arraylist);

	}

}
