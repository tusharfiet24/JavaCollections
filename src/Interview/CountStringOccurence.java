package Interview;

public class CountStringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aanjada";
		int count = countOccurence(s, 'a');
		System.out.println(count);
	}

	public static int countOccurence(String word, char character) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == character)
				temp++;
		}
		return temp;
	}

}
