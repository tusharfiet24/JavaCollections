import java.util.Scanner;

public class MultipleInputProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] names = input.split(" ");
		
		for(String name: names) {
			System.out.print(Integer.parseInt(name));
			System.out.print(" ");
		}
		
		sc.close();
	}

}
