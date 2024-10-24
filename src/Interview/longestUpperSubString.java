package Interview;

public class longestUpperSubString {
	public static void main(String[] args) {
		String s = "aBCNMKLOPderDFGRTvbbSDERGasddffQQQE";
		int count = longestUpperSubstring(s);
		System.out.println(count);
	}
	
	public static int longestUpperSubstring(String s) {
		int count = 0;
		int temp = 0;
		
		for(int i = 0; i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				temp++;
			}
			else {
				if(count < temp)
					count = temp;
				temp = 0;
			}
		}
		if(count < temp)
			count = temp;
		
		return count;
	}

}
