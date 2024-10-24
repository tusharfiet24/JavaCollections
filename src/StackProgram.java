import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		stack.push("Tushar");
		stack.push("Arjun");
		stack.push("Govind");
		
		stack.push("Abhinav");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}

}
