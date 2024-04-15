package com.example.project;

import java.util.Arrays;

public class BubbleSort {

	void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Driver method to test above
	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));

	}
}
