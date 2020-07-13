package dataStructurePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfCharacters {

	public static void main(String[] args) {


		String name = "My Name is Maricel";
		//Declare map to store elements
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		//Iterate String Character one by one
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (map.get(ch) == null)
				map.put(ch, 1);
			else 
				map.put(ch, map.get(ch) + 1);
			
		}
		System.out.println(map);

	}

}
