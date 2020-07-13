package collectionsFrameworkPractice;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
		 if(i==j)
			 continue;
				System.out.println("i:"  + i + ", j: "+ j);			
			}		
			
			System.out.println("_______________________\n ");
		}
		int [] numbers = { 10, 20, 30, 40, 50 };
		
		 for (int i = 0; i < numbers.length; i++) {
			 if (numbers[i] == 30) {
				 continue;
			 }
			System.out.println(numbers [i]);
		}
	

	}

}
