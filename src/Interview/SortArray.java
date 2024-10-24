package Interview;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 3, 1, -6, 4, 9 };

		System.out.print("Before Sorting: ");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
//					 Without temp variable
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

//					// With temp variable
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
				}
			}
		}

		System.out.print("\nAfter Sorting: ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
