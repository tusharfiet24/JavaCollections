package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 1, 2 };
		Solution solution = new Solution();
		System.out.println(solution.removeDuplicates(arr));

	}
}

class Solution {
	public ArrayList<Integer> removeDuplicates(int[] nums) {
		ArrayList<Integer> ls = new ArrayList<>();
		if (nums.length <= 1) {
//			ls.addAll(Collections.);
			return ls;
		}
		
		for (int num : nums) {
			if (!ls.contains(num)) {
				ls.add(num);
			}
		}
		
		return ls;
	}
}
