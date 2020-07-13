package dataStructurePractice;

public class FibonacciSeries {

	public static void main(String[] args) {

		// printing first 10 numbers of Fibonacci Series

		int a = 0;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(b + ", ");
			int c = a + b;
			a = b;
			b = c;

		}
		System.out.println();
	}

}

