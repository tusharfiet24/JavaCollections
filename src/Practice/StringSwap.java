package Practice;

public class StringSwap {
	public static void main(String[] args) {
		String firstName = "Tushar";
		String lastName = "Rathor";
		swapString(firstName, lastName);
	}

	public static void swapString(String firstName, String lastName) {
		System.out.println("Before swap: " + firstName + " " + lastName);
		firstName += lastName;
		lastName = firstName.substring(0, firstName.length() - lastName.length());
		firstName = firstName.substring(lastName.length());
		System.out.println("After swap: " + firstName + " " + lastName);
	}
}
