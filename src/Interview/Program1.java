package Interview;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Sum: " + sumArray(arr));
	}

	public static int sumArray(int[] arr) {
		int total = 0;
		for (int n : arr) {
			total += n;
		}

		return total;
	}

}
