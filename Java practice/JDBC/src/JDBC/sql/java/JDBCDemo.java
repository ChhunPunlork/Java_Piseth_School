package JDBC.sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.sql.java.Model.Student;
import JDBC.sql.java.Model.Service.Student_Service;

public class JDBCDemo {
	private static Connection connection;
	private static Scanner sc;
	private static Student_Service service = new Student_Service();
	
	public JDBCDemo(){
	}
	
	public static void main(String[] args) {
		Connection cn = connectToSQL();
		JDBCDemo demo = new JDBCDemo();
//		Student student = service.FindById(10606, cn);
//		Student student = service.FindById(10, cn);
//		System.out.println(student.toString());
//		if(student != null) {
//			student.setName("THY VISOTHI");
//			service.updateStudent(student, cn);
//		}
		//update student
//		int id = 11;
//		service.deleteStudent(id, cn);
		List<Student> allStudent = service.getSllStudent(cn);
	}

	public static Connection connectToSQL() {
		try {
			String url = "jdbc:postgresql://localhost:5432/Students_MG";
			String user = "Lorkdb";
			String password = "Lork10604";
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection and operation successful");
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Database connection or SQL operation failed");
			e.printStackTrace();
		}
		return null;
	}
	
	private static void Save() {
		connection = connectToSQL();
		Student student = new Student(10607, "Chroeung Polroth", "Male", 12);
		service.save(student, connection);
	}
//	public static Student setValueToStudent() {
//		int id = sc.nextInt();
//		String name = sc.next();
//		String gender = sc.next();
//		int grade = sc.nextInt();
//		int id = 106105;
//		String name = "Sim Punleu";
//		String gender = "Male";
//		int grade = 11;
//		Student student = new Student(id, name, gender, grade);
//		return  student ;
//	}
//	public static Student Save(Student student) {
//		String InsertSQL = "INSERT INTO students(name, gender, grade) VALUES(?, ?, ?)";
//		
//		try {
//			PreparedStatement preparedStatement = connection.prepareStatement(InsertSQL);
//			preparedStatement.setString(1, student.getName());
//			preparedStatement.setString(2, student.getGender());
//			preparedStatement.setInt(3, student.getGrade());
//			preparedStatement.executeUpdate();
//			System.out.println("Success!");
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}		
//		return student;
//	}

}