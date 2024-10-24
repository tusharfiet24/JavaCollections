package Hash;

import java.util.HashSet;

public class IntersectionOf2Array {
	public static void main(String[] args) {
		int[] arr1 = { 7, 3, 9 };
		int[] arr2 = { 6, 3, 9, 2, 9, 4 };

		HashSet<Integer> hs = new HashSet<>();
		for (int i : arr1) {
			hs.add(i);
		}

		int count = 0;
		for (int j : arr2) {
			if (hs.contains(j)) {
				count++;
				System.out.println(j);
				hs.remove(j);
			}
		}
		System.out.println("Count: "+count);
	}
}
