package Interview;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args) {
//		String s = "aaabcbccaa";
//		HashMap<Character, Integer> map = new HashMap<>();
//		String temp = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			if (!temp.contains(Character.toString(s.charAt(i)))) {
//				temp += s.charAt(i);
//				map.put(s.charAt(i), 1);
//			} else {
//				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//			}
//		}
//
//		for (int i = 0; i < temp.length(); i++) {
//			System.out.print(Character.toString(temp.charAt(i)) + map.get(temp.charAt(i)));
//		}
		
		String s = "aaabcbccaa";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
	}

}
