import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a book";

		List<String> reverseWord = Arrays.stream(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.toList());

		System.out.println(String.join(" ", reverseWord));
	}
}
