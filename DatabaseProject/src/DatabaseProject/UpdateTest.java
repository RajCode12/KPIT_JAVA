package DatabaseProject;

import java.sql.*;
import java.util.*;

public class UpdateTest {
	public static void main(String[] args) {
		//1. load the driver (ctrl+shift+M)
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is registerd...");
				
				
			Connection conn1 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Update
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter the name");
			String name1 = sc3.next();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the location");
			String loc1 = sc2.next();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the number");
			int num1 = sc1.nextInt();
			
			// for insert query
			// place according to the input
			PreparedStatement pst = conn1.prepareStatement("UPDATE MYDEPT120 SET DEPTNAME=?, LOC=? WHERE DEPTNO=?");
			pst.setString(1, name1);
			pst.setString(2, loc1);
			pst.setInt(3, num1);
			
			int rows = pst.executeUpdate();
			System.out.println(rows);
			
			pst.close();
			conn1.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
