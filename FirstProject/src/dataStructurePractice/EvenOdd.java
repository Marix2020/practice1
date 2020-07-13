package dataStructurePractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int number = sc.nextInt();

		// Write logic to check number - Even or Odd

		if (number % 2 == 0)
			System.out.println(number + "  is a Even number");
		else
			System.out.println(number + "  is a Odd number");

	}

}

