package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 7, 3, 9 };
		int[] arr2 = { 6, 3, 9, 2, 9, 4 };

		HashSet<Integer> hs = new HashSet<>();

		for(int i = 0; i<arr1.length;i++) {
			hs.add(arr1[i]);
		}

		int j = 0;
		while (j < arr2.length) {
			hs.add(arr2[j]);
			j++;
		}

		System.out.println(hs);
		
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
