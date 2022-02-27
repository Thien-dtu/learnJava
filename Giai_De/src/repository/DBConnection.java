package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String HOSTNAME = "DESKTOP-48CKIRF";
	private static final String PORT = "1433";
	private static final String DATABASE = "Beneficiary";
	
	private static final String URL = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + "; databaseName=" + DATABASE;
	private static final String USER = "sa";
	private static final String PW = "thien1209.A";

	public static Connection getConnection() {
		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			Connection conn = DriverManager.getConnection(URL, USER, PW);
			System.out.println("KET NOI THANH CONG");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("KET NOI THAT BAI");
		}
		return null;
	}
}
