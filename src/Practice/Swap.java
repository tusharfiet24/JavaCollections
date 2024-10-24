package Practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;

		System.out.println("a: " + a + ", b: " + b);
		// without temp variable
//		a = a + b;
//		b = a - b;
//		a = a - b;
		// with temp variable
		int temp = a + b;
		a = temp - a;
		b = temp - a;

		System.out.println("a: " + a + ", b: " + b);
	}

}
