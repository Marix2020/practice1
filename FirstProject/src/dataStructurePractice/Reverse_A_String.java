package dataStructurePractice;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String : ");
		String string = sc.next();

		// declare a variable to store the output
		String reverseString = "";

		// Write a logic //
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);

		}
		System.out.println("Original String : " + string);
		System.out.println("Original Reverse String : " + reverseString);

	}

}
