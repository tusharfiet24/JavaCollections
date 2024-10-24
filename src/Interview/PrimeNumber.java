package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 49;
		if (isPrime(value))
			System.out.println("Number " + value + " is a prime number.");
		else
			System.out.println("Number " + value + " is not a prime number.");

//		int num = 100;
//		System.out.print("Prime numbers upto 100: ");
//		for (int j = 2; j < num; j++) {
//			if (isPrime(j))
//				System.out.print(j + " ");
//		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int) n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
