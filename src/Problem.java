import java.util.ArrayList;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1231.12323.12312";
		System.out.println(removeLastDot(s));
	}
	
	public static String removeLastDot(String s) {
		String[] arr = s.split("\\.");
		ArrayList<String> lst = new ArrayList<>();
		
		for(int i =0; i<arr.length-1;i++) {
			lst.add(arr[i]);
		}
		
		String result = String.join(".", lst);
		return result;
	}

}
