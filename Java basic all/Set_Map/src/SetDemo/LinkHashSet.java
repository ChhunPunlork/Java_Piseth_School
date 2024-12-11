package SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		
		System.out.println("Linked element sorted: ");
		for(int number : set) {
			System.out.println(number);
		}

	}

}
