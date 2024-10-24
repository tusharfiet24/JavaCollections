package stringInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "..geeks..for.geeks.";
		System.out.println(reverseString(s)); //geeks.for.geeks

//		String s1 = "This is my book";
//		System.out.println(reverseString1(s1)); //sihT si ym koob
	}

	public static String reverseString(String s) {
		String[] str = s.split("\\.");
		List<String> words = new ArrayList<>();
		for (String word : str) {
			if (!word.isEmpty()) {
				words.add(word);
			}
		}
		Collections.reverse(words);

		return String.join(".", words);
	}

	public static String reverseString1(String s) {
		String[] str = s.split(" ");

		StringBuilder sb;
		int i = 0;
		for (String word : str) {
			sb = new StringBuilder(word);
			sb.reverse();
			str[i] = sb.toString();
			i++;
		}

		return String.join(" ", str);
	}

}
