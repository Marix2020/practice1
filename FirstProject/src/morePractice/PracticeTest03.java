package morePractice;

public class PracticeTest03 {

	public static void main(String[] args) {
		
		
		int a = 5, b = 7, c = 9, max1, max2;
		
		//Approach 1
		
		max1 = Math.max(a, b);
		max1 = Math.max(max1, c);
		
		
		//Approach2
		
		max2 = Math.max(a, Math.max(b, c));
		
		

	}

}
