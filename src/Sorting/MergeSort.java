package Sorting;

public class MergeSort {

	public static void mergeSort(int[] array) {
		// Base Test
		if (array.length <= 1)
			return;

		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}

		for (int i = mid; i < array.length; i++) {
			right[i - mid] = array[i];
		}

		mergeSort(left);
		mergeSort(right);

		merge(array, left, right);
	}

	public static void merge(int[] array, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) { 
			array[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int[] array = { 38, 27, 43, 91, 3, 9, 82, 10 };
		mergeSort(array);

		System.out.print("Sorted array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
