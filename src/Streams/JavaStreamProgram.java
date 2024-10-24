package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count the number of names starting with alphabet A in list
		ArrayList<String> names = new ArrayList<>();
		names.add("Azbhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		int count = 0;
		
		for(int i = 0; i<names.size();i++) {
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		
//		streamFilter(names);
		streamMap(names);
		streamCollect(names);
		System.out.println(count);
//		System.out.println(streamFilter(names));
	}

	public static int streamFilter(ArrayList<String> names) {
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true
		//We can create stream
		//how to use filter in Stream API
		int count = (int) names.stream()
				.filter(s -> s.startsWith("A")).count();
		
		long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s -> 
		{
			if(s.startsWith("A"))
				return true;
			else
				return false;
		}).count();
		
		System.out.println(d);
		//print all the names of Arraylist where length is greater than 4
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));		
		
		return count;
	}
	
	public static int streamMap(ArrayList<String> names) {
		//print names which have last letter a with Uppercase
//		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama")
//		.filter(s -> s.endsWith("a"))
//		.map(s -> s.toUpperCase())
//		.forEach(s-> System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		names.stream().filter(s -> s.startsWith("A"))
		.sorted().map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
		
		ArrayList<String> names1 = new ArrayList<>();
		names.add("man");
		names.add("don");
		names.add("woman");
		
		//Merging 2 different lists
		Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s -> System.out.println(s));
		
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		
		return -1;
	}
	
	public static void streamCollect(ArrayList<String> names) {
		List<String> ls =Stream.of("Abhijeet","Don","Alekhya","Adam","Rama")
		.filter(s -> s.endsWith("a"))
		.map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		System.out.println(ls.getLast());
		
		//
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		numbers.stream().distinct()
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//sort the array - 3rd index
		List<Integer> li = numbers.stream().distinct().sorted()
		.collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
