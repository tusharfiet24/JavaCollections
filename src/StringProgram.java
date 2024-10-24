public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Tushar";
		String s2 = "tushar";
		String s3 = new String("Tushar");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		
		char[] ch = s1.toCharArray();
		String s4 = "";
		for(int i = ch.length-1; i >= 0; i--) {
			s4 += ch[i];
		}	
		
		System.out.println(s4.compareTo("rahsuT"));

	}

}
