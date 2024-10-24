package leetcode;

class Solution2 {
	public int lengthOfLastWord(String s) {
		String s1 = s.trim();
		if (s1.length() == 1) {
			return 1;
		}
		String[] words = s1.split(" ");
		return words[words.length - 1].length();
	}
}

public class Lastwordlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 solution = new Solution2();
		System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
	}

}
