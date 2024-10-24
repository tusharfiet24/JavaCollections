package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
// HashSet -> Unique value, UnOrdered 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating
		HashSet<Integer> hs = new HashSet<>();
		
		//Insert
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(1);
		hs.add(3);
		hs.add(4);
		
		//Search - contains
		if(hs.contains(1)) {
			System.out.println("Set contains 1");
		}
		
		if(!hs.contains(6)) {
			System.out.println("does not contain");
		}
		System.out.println(hs);
		
		hs.remove(1);
		if(!hs.contains(1)) {
			System.out.println("does not contain");
		}
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
