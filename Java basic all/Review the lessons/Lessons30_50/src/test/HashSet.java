package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet {
	public static void main(String[] arqs) {
//		Set<String> hashSet = new java.util.HashSet<>();
//		hashSet.add("Lork");
//		hashSet.add("Leu");
//		hashSet.add("Long");
//		hashSet.add("Lim");
//		
//		System.out.println(hashSet);
		
//		List<String> list = new ArrayList<>();
//		list.addAll(hashSet);
//		list.add("Leang");
//		System.out.println(list);
		
		//access hashSet iterator
//		Iterator<String> iterator = hashSet.iterator();
//		while(iterator.hasNext()) {
//			String name = iterator.next();
//			System.out.println(name);
//		}
		
		Set<Integer> set1 = new java.util.HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		Set<Integer> set2 = new java.util.HashSet<>();
		set2.add(30);
		set2.add(40);
		set2.add(50);
		
		System.out.println("Set1" + set1);
		System.out.println("Set2" + set2);
		
		//set1.addAll(set2);
		//set1.retainAll(set2);
		//set1.removeAll(set2);
		set1.containsAll(set2);
		System.out.println(set1);
	}

}
