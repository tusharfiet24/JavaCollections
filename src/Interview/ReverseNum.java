package Interview;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		reverseNum(num);

	}

	public static void reverseNum(int num) {
		// TODO Auto-generated method stub
		int rem = 0;
		int reverse = 0;

		while (num > 0) {
			rem = num % 10;
			num /= 10;
			reverse = reverse * 10 + rem;
		}

		System.out.println("Reverse number is " + reverse);
	}

}
