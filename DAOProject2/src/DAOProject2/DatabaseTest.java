package DAOProject2;

import java.time.LocalDate;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class DatabaseTest {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the database");
			System.out.println("**********************");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from EMPLOYEE");
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Dept : " + rs.getString(3));
				System.out.println("Salary : " + rs.getInt(4));
				System.out.println("Job : " + rs.getString(5));
				System.out.println("Joining Date : " +rs.getDate(6));
				System.out.println("**********************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
