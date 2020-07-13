package dataStructurePractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 34, 23, 12, 1, 88, 11 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// swap number when it is iterated
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
