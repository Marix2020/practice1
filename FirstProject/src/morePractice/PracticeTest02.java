package morePractice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTest02 {

	public static void main(String[] args) {

		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);

		StringBuilder puzzle = new StringBuilder("This is more easier way to reverse");
		puzzle.reverse();


		char[] c = new char[2];
		int length = c.length;
		System.out.println(length);

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		for (String s : list)
			System.out.println(s);
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for (Integer v : values)
			System.out.println(v);

		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y + " y answer");

//		LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
//
//		System.out.println(date);
		
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse") System.out.println("==");
		if (a.equals("2cfalse")) System.out.println("equals");
		
		System.out.println(a);
				
		
		String s = "purr";
		
		System.out.println(s.substring(1, 3));
			
		
		

	}
}
