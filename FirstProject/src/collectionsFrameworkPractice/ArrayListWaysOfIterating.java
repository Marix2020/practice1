package collectionsFrameworkPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListWaysOfIterating {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Prison Break");
		tvSeries.add("Being Erica");
		tvSeries.add("Yi San (Promise)");
		tvSeries.add("Breaking Bad");
		tvSeries.add("Wala na Akong Maisip");
		
		// Different ways Iterating an ArrayList
		//1. Using for each loop and lambda expression:
		System.out.println("------------- Print using For EACH Loop");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("---------Print using Iterator -----");
		
		//2. Using Iterator
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. Using Iterator and Java 8 forEachRemaining() method
		System.out.println("--------Print Using ForEachRemainin method () -----");
		
		it = tvSeries.iterator();
		it.forEachRemaining(show->{
			System.out.println(show);
		});
		
		//4. Using For EACH Loop
		System.out.println("---------Print Using For Each Loop --------");
		for (String show : tvSeries) {
			System.out.println(show);	
		}
		
		//5. Using For Loop with order/index:
		System.out.println("-------Print using For Loop with order/index ------");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. Using a listIterator() to traverse in both the directions
		System.out.println("-------Print using a listIterator() to traverse in both the directions --------");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
		
		
		
		

	}

}
