package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
	public static void main(String[] aqrs) {
		ArrayList<String> nameList = new ArrayList();
		nameList.add("Lork");
		nameList.add("Seu");
		nameList.add("Noth");
//		System.out.println(nameList);
		//setindex
//		System.out.println(nameList.get(1));
//		
//		//updateIndex
//		nameList.set(2, "Nith");
//		System.out.println(nameList);
//		
//		//checkSize
//		System.out.println(nameList.size());
//		
//		//sort
//		Comparator<String> comareASC = new Comparator<String>() {
//			
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		};
//		nameList.sort(comareASC);
//		System.out.println(nameList);
//		
//		//checking data
//		boolean exit = nameList.contains("Lork");
//		System.out.println(exit);
//		
//		//check
//		boolean check = nameList.isEmpty();
//		System.out.println(check);
//		
//		//check no. index
//		System.out.println(nameList.indexOf("Lork"));
//		
//		for(int i = 0; i<nameList.size(); i++) {
//			System.out.println((i+1) + ". " + nameList.get(i));
//		}
//		for(String name : nameList) {
//			System.out.println(name);
//		}
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(21);
		ages.add(34);
		ages.add(55);
		System.out.println(ages.get(1));
		
	}
}
