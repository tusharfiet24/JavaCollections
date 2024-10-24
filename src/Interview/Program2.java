package Interview;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		table(n, 10);
	}
	
	public static void table(int i, int j) {
		int k = 1;
		int temp = 0;
		System.out.println("Table of number 5: ");
		while(k<=j) {
			temp += 5;
			System.out.println(temp);
			k++;
		}
		
	}
}
