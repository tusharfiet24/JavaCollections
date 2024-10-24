
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I Love Dogs";
		String c = "";
		
		for(int i = 0;i<s.length();i++) {
			String temp1 = Character.toString(s.charAt(i));
			
			if(temp1.isBlank() || c.contains(temp1))
				continue;
			c += temp1;
			
			for(int j = 0;j<s.length();j++) {
				String temp2 = Character.toString(s.charAt(j));
				
				if(temp1.equals(temp2) || temp2.isBlank())
					continue;
				else if(j < s.length()-1) {
					System.out.print(temp1+temp2);
					System.out.print(", ");
				}else
					System.out.print(temp1+temp2);
			}
			
			System.out.println();
		}
	}

}
