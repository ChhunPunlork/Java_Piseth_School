package test;

public class SchoolApp {
	public static void main(String[] qrqs) {
		School school = new School();
		school.setName("=================Registration Student================");
		System.out.println(school.getName());
		Student st1 = new Student(1, "Chhun Punlork", Gender.M);
		Student st2 = new Student(2, "Lim Sokha", Gender.F);
		Student st3 = new Student(3, "Chhan Ratha", Gender.F);
		Student st4 = new Student(4, "Jame Gird", Gender.M);
		school.register(st1);
		school.register(st2);
		school.register(st3);
		school.register(st4);

		school.displayStudent();
		System.out.println("=====================================================");
		//school.SortByName();
		//Student studentInfo = school.findByName("Jame Gird");
		//System.out.println(studentInfo.toString());
//		school.RemoveById(1);
//		Student foundStudent = school.findById();
//		if(foundStudent != null) {
//			System.out.println(foundStudent);
//		}else {
//			System.out.println("Id is't in the list");
//		}
		Student studentToUpdate = new Student("Chhun Sokha", Gender.M);
		school.updateStudent(4, studentToUpdate);
		school.displayStudent();
	}
}
