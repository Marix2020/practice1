package dataStructurePractice;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 20;
		int b = 30;

		System.out.println("Before Swap : a: " + a + ", b :  " + b);

		// Swap numbers
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap  : a: " + a + ", b :  " + b);

	}

}
