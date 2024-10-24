package leetcode;

import java.util.HashMap;

class Solution1 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		if (s.length() <= 1) {
			return map.get(s.charAt(0));
		}

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int valueCurrent = map.get(s.charAt(i));
			if (i + 1 < s.length()) {
				int valueNext = map.get(s.charAt(i + 1));
				if (valueCurrent >= valueNext) {
					result += valueCurrent;
				} else {
					result += (valueNext - valueCurrent);
					i++;
				}
			} else {
				result += valueCurrent;
			}
		}

		return result;
	}
}

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 solution = new Solution1();
		System.out.println(solution.romanToInt("MCMXCIV"));
	}

}
