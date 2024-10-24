package Interview;

import java.util.ArrayList;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 4, 5, 7 };
		int[] arr2 = { 6, 4, 3, 7 };
		compareArray(arr1, arr2);

	}

	public static void compareArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls = new ArrayList<>();

		int arrlength = arr1.length > arr2.length ? arr1.length : arr2.length;

		for (int i = 0; i < arrlength; i++) {
			if (arr1[i] == arr2[i])
				ls.add(arr1[i]);
		}

		Object[] c = ls.toArray();
		for (Object obj : c) {
			System.out.print(obj + " ");
		}

//		System.out.println(ls);
//		ls.stream().forEach(n -> System.out.print(n + " "));
	}

}
