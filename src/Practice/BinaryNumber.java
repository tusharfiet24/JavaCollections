package Practice;

import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		int binNum = 0;
		int base = 1;
		// 9 = 1001

		while (n > 0) {
			rem = n % 2;
			binNum += (rem * base);
			base *= 10;
			n = n / 2;
		}

		System.out.println("Binary number of " + temp + " is: " + binNum);
	}

}
