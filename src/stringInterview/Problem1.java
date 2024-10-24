package stringInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "aaabcbccaa";
//
//		Map<String, Integer> map = new LinkedHashMap<>();
//
//		for (String let : str.split("")) {
//			map.put(let, map.getOrDefault(let, 0) + 1);
//		}
//
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.print(entry.getKey() + "" + entry.getValue());
//		}

		int[] arr = { 11, 8, 9, 6, 11, 6, 3, 2, 9, 3, 1, 7 };

		Map<Integer, Integer> map1 = new LinkedHashMap<>();
		for (int num : arr) {
			map1.put(num, map1.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
