package Generics.Java.student;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class studentApplication {
	private static List<Student> students = List.of(new Student(1, "Lork", "M", 17), new Student(2, "Long", "M", 16),
			new Student(3, "Lux", "F", 20), new Student(4, "Laa", "F", 15), new Student(5, "Leu", "M", 17));

	public static void main(String[] args) {
		System.out.println("Imerative");
		List<Student> list1 = getStudent(students);
		for (Student st : list1) {
			System.out.println(st);
		}
		
		System.out.println("Declaretive");
		List<Student> list2 = getStudentDeclarative(students);
		list2.forEach(System.out::println);
	}

	public static List<Student> getStudent(List<Student> student) {
		List<Student> list = new ArrayList<>();
		int counter = 0;
		int limit = 2;
		for (Student st : student) {
			if (st.getGender().equals("F")) {
				list.add(st);
				counter++;
			}
			if (counter == limit) {
				break;
			}
		}

		return list;
	}
	public static List<Student> getStudentDeclarative(List<Student> student) {
		return student.stream()
		.filter(st -> st.getGender().equals("F"))
		.limit(3)
		.collect(Collectors.toList());
	}

}
