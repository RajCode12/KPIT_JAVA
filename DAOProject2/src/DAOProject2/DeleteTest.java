package DAOProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the database");
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Employee id to be Deleted: ");
			int id = sc1.nextInt();
			
			PreparedStatement pst = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
			pst.setInt(1,id);
			
			int rows = pst.executeUpdate();
			System.out.println("Rows Updated : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
