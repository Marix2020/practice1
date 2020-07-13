package dataStructurePractice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int input = 60; // searching the value of 60

		// first arrange elements in sorting order
		Arrays.sort(arr);

		// Writing logic to perform binary search
		int index = getElementIndex(arr, input);
		System.out.println(input + " is at index : " + index);

	}

	// performing search operation by using Binary Search Algorithm
	private static int getElementIndex(int[] arr, int input) {
		int start = 0;
		int last = arr.length - 1;
		while (start <= last) {
			int middle = (start + last) / 2;

			if (input == arr[middle])
				return middle;
			else if (input > arr[middle])
				start = middle + 1;
			else if (input < arr[middle])
				last = middle - 1;

		}
		return -1;
	}

}
