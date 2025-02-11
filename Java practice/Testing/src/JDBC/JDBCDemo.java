package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {
	private static Connection connection;
	private static StudentService studentService = new StudentService();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean Exit = true;
//			System.out.println("==================================================");
//			System.out.println("\t1. To Complete student information.");
//			System.out.println("\t2. To exit.");
//			System.out.println("==================================================");
//			System.out.print("====Input option: ");
		connect();
		GUI_form form = new GUI_form(connection);
		form.setVisible(true);
	}

	public static Connection connect() {
		try {
			// Database connection detail
			String url = "jdbc:postgresql://localhost:5432/Student";
			String user = "Lorkdb";
			String password = "Lork10604";
			// Driver
			Class.forName("org.postgresql.Driver");
			// Connection to db
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connect success!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Not success!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	public static Student st1() {
		System.out.println("==================================================");
		System.out.print("\t- Input your name  : ");
		String name = sc.next();
		System.out.print("\t- Input your gender: ");
		String gender = sc.next();
		System.out.print("\t- Input your grade : ");
		int grade = Integer.parseInt(sc.next());
		System.out.println("==================================================");
		Student student = new Student(name, gender, grade);
		return student;
	}

}
