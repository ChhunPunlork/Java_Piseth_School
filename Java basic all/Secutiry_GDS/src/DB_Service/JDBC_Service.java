package DB_Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Service {
	private static final String url = "jdbc:postgresql://localhost:5432/Security_GDS";
	private static final String pwt = "Lork10604";
	private static final String user = "Lorkdb";

	public static void ConnetToDB() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(url, user, pwt);
			connection.close();
			System.out.println("Connection Successed!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Not found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
