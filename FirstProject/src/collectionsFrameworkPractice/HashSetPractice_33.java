package collectionsFrameworkPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetPractice_33 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Becky");
		al.add("Chaitanya");
		al.add("Ajay");
		al.add("Rock");
		al.add("Becky");

		System.out.println("This is all data with duplicates  " + al + "\n");
		
		HashSet hs = new HashSet();
		for (int i = 0; i < al.size(); i++) {
			hs.add(al.get(i));
				
		}
		System.out.println(" This is the list or data without duplicates  "  +  hs);

//		List<String> newList = new ArrayList<>();
//
//		for (String alnew : newList) {
//			if (!newList.contains(alnew)) {
//				newList.add(alnew);
//			}
//
//		}
//		for (String alName : newList) {
//
//			System.out.println("Names without Duplicates:    " + alName);
//		}
//		

	}

}



