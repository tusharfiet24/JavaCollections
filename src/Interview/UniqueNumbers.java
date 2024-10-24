package Interview;

import java.util.ArrayList;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> ls = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!ls.contains(arr[i])) {
				ls.add(arr[i]);
				k++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						k++;
				}
//				System.out.println(arr[i] + ": " + k);
				if(k == 1)
					System.out.println(arr[i]+" is unique number.");
				
			}
		}

//		for (int n : arr) {
//			if (!ls.contains(n))
//				ls.add(n);
//		}
//
//		for (int n : ls) {
//			System.out.print(n + " ");
//		}
	}
}
