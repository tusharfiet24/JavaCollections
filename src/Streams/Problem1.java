package Streams;

import java.util.ArrayList;

public class Problem1 {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(6);
		lst.add(8);
		lst.add(10);
		
		int sum = 0;
		for(int i =0;i<lst.size();i++) {
			sum += lst.get(i);
		}
		
		System.out.println(lst +": "+ sum/lst.size());
		
		double avg = lst.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(lst +": "+ avg);
	}
}
