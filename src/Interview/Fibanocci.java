package Interview;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a = 0;
		int b = 1;
		int sum = 0;

		System.out.print("Fibanocci series upto " + n + ": " + a + " " + b + " ");

//		for (int i = 2; i < n; i++) {
//			sum = a + b;
//			a = b;
//			b = sum;
//			System.out.print(sum + " ");
//		}

		int i = 2;
		while (i < n) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum + " ");
			i++;
		}

	}

}
