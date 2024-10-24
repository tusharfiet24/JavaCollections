//import java.util.Stack;

public class InterviewProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
//		System.out.println(solution.isValid("){"));
		int[] arr = solution.twoSum(new int[] {3,3}, 6);
		System.out.println(arr[0]+","+arr[1]);
	}

}

//class Solution {
//    public boolean isValid(String s) {
//    	Stack<Character> stack = new Stack<>();
//    	stack.push('\0');
//    	
//    	for(int i = 0; i<s.length();i++) {
//    		if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//    			stack.push(s.charAt(i));
//    		}else if(s.charAt(i) == ')' && stack.peek() == '(') {
//    			stack.pop();
//    		}else if(s.charAt(i) == '}' && stack.peek() == '{') {
//    			stack.pop();
//    		}else if(s.charAt(i) == ']' && stack.peek() == '[') {
//    			stack.pop();
//    		}else {
//    			return false;
//    		}
//    	}
//    	if(stack.isEmpty()) {
//    		return true;
//    	}
//    	return false;
//    }
//}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int i = 0;
    	int num1 = nums[0];
    	
    	while(i<nums.length-1) {
    		for(int j = i+1;j<nums.length;j++) {
    			int temp = num1 + nums[j];
    			if(temp == target) {
    				return new int[] {i,j};
    			}
        	}
    		i++;
    		num1 = nums[i];
    	}
    	return null;
    }
}