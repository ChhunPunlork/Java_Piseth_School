package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] arqs) {
		Set<String> set = new HashSet<>();
		set.add("Khouch");
		set.add("Lork");
		set.add("Leu");
		set.add("Long");

		for (String name : set) {
			System.out.println(name);
		}
	}
}
