import java.util.ArrayList;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//longest substring without repeating the characters
		ArrayList<String> ls = new ArrayList<>();
		String s = "abdefgabef";
		String s1 = "";
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if(!temp.contains(Character.toString(s.charAt(j)))){
					temp += s.charAt(j);
				}else {
					if(temp.length() >= s1.length()) {
						s1 = temp;
						if(!ls.contains(s1))
							ls.add(s1);
						temp = "";
						break;
					}else {
						temp = "";
						break;
					}		
				}
			}
		}
		System.out.println(s1.length());
		System.out.println(ls);
	}

}
