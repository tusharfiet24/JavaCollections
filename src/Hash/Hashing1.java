package Hash;

import java.util.HashMap;
import java.util.Map;

public class Hashing1 {
//HashMap<Key, Value> - Unordered, Unique Keys, Not Unique Values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating HashMap
		HashMap<String,Integer> hm = new HashMap<>();
		//Inserting
		hm.put("India", 120);
		hm.put("US", 30);
		hm.put("China", 150);
		//Updating
		hm.put("US", 46);
		
		System.out.println(hm);
		
		//Search
		if(hm.containsKey("Japan")) {
			System.out.println("Key is present in the map");
		} else {
			System.out.println("Key is not present in the map");
		}
		//Fetch data
		System.out.println(hm.get("China"));
//		System.out.println(hm.get("Japan"));
		
//		for(String key:hm.keySet()) {
//			System.out.println(key+": "+hm.get(key));
//		}
		
		for(Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//Remove
		hm.remove("China");
		System.out.println(hm);
	}

}
