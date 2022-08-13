package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
//		arrayList.stream().filter( n -> n % 2 ==0 ).forEach((n) -> System.out.println(n));
		
//		List<Integer> collect = arrayList.stream().filter( n -> n % 2 ==0 ).collect(Collectors.toList());
		
		List<Integer> collect = arrayList.stream().map( n -> n * 2 ).collect(Collectors.toList());
		
		System.out.println(collect);
		
		collect.forEach(n -> System.out.println(n));
		
	}

}
