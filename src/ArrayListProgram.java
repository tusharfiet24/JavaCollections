import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> lst = new ArrayList<>();
////		ArrayList<String> lst2 = new ArrayList<String>();
////		ArrayList<Boolean> lst3 = new ArrayList<Boolean>();
//		
//		lst.add(0);
//		lst.add(2);
//		lst.add(3);
//
//		System.out.println(lst);
//		System.out.println(lst.get(1));
//
//		lst.add(1, 5);
//		System.out.println(lst);
//
//		lst.set(0, 7);
//		System.out.println(lst);
//
//		lst.remove(2);
//		System.out.println(lst);
//
//		System.out.println(lst.size());
//
//		for (int num : lst) {
//			System.out.print(num + " ");
//		}
//
//		System.out.println();
//		System.out.println("Before Sort: " + lst);
//		Collections.sort(lst, Collections.reverseOrder());
//		System.out.println("After Sort: " + lst);
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(100);
		lst.add(1000);
		lst.add(94);
		lst.add(105);
		
		System.out.println("Before Sort: " + lst);
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println("After Sort: " + lst);	
	}

}
