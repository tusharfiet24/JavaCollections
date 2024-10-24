package Interview;

public class MinMax2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };

		int min = arr[0][0];
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min)
					min = arr[i][j];
				else if (arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.println("Min: " + min + " Max: " + max);
	}

}
