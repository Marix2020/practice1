package morePractice;

import java.util.ArrayList;

public class PracticeTest04 {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(4); numList.add(5); numList.add(6);
		
		for (int i = 0; i < numList.size(); i++) {  //for Loop
			System.out.println(numList.get(i) + " ");
			System.out.println("\n");
			
		}
		for (Integer num : numList) { //For each Loop
			System.out.println(num + " ");
			
		}

	}

}
