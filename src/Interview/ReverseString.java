package Interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madams";
		if (isPalindrom(s))
			System.out.println("String is palindrom.");
		else
			System.out.println("String is not palindrom.");
	}

	public static boolean isPalindrom(String s) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}

		if (s.equals(temp))
			return true;

		return false;
	}

}
