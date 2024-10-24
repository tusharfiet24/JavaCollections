package Hash;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 45, 50, 60 };
		int num = 45;
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == num) {
				System.out.println(num + " is found at index " + mid);
				break;
			} else {
				if (arr[mid] < num) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
	}

}
