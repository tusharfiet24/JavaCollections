package Hash;

import java.util.HashMap;

public class FindItineraryFromTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		map.put("Chennai", "Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		
		String start = "";
		for(String source:map.keySet()) {
			if(!map.containsValue(source)) {
				start = source;
			}
		}
		System.out.print(start+" -> ");
		
		int t = map.size();
		while(t-->0) {
			System.out.print(map.get(start));
			start = map.get(start);
			if(t>0)
				System.out.print(" -> ");
		}
		
//		while(map.containsKey(start)) {
//			System.out.print(map.get(start)+" -> ");
//			start = map.get(start);
//		}
	}

}
