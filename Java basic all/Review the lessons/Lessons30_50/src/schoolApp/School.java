package schoolApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
	private String name;
	private ArrayList<Student> students = new ArrayList<>();
	
	public void register(Student student) {
		students.add(student);
	}
	
	public void display() {

		for(Student student : students) {
			System.out.println("  Id: %d, Name: %s, Gender: %s,".formatted(student.getId(), student.getName(), student.getGender()));
		}
	}
	
	public void sortbyname() {
		Comparator<Student> comparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
	}

	public Student findbyId(int studentId) {
		for(Student student : students) {
			if(student.getId() == (studentId)) {
				return student;
			}
		}
		return null;
	}
	
	public void UpdateById(int studentId, Student NewStudent) {
		Student student = findbyId(studentId);
		if(student != null) {
			student.setName(NewStudent.getName());
			student.setGender(NewStudent.getGender());
		}else {
			System.out.println("Not found student!");
		}
	}

	public void RemoveById(int studentId) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == studentId) {
				iterator.remove();
			}
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
