package Set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] arqs) {
		
		System.out.println(Size.getAll());
		EnumSet<Size> set2 = EnumSet.noneOf(Size.class);
		set2.add(Size.MEDIUM);
		System.out.println(set2);
		EnumSet<Size> range = EnumSet.range(Size.SMALL, Size.EXTRALARGE);
		System.out.println(range);
		EnumSet<Size> of = EnumSet.of(Size.SMALL, Size.MEDIUM);
		System.out.println(of);
		
	}
}
