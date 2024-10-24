package Hash;

import java.util.HashMap;

public class MajorityElementProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
		int[] nums = { 1, 2};
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int num : nums) {
			if (!hm.containsKey(num)) {
				hm.put(num, 1);
			} else {
				hm.put(num, hm.get(num) + 1);
			}
		}

		for (Integer key : hm.keySet()) {
			if (hm.get(key) > (nums.length / 3)) {
				System.out.println(key);
			}
		}
	}

}
