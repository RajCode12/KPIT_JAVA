package DatabaseProject;

import java.sql.*;
import java.util.*;

public class InsertTest {
	public static void main(String[] args) {
		//1. load the driver (ctrl+shift+M)
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is registerd...");
				
				
			Connection conn1 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Insert
			Scanner sc1 = new Scanner(System.in);
			int num1 = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			String name1 = sc2.next();
			
			Scanner sc3 = new Scanner(System.in);
			String loc1 = sc3.next();
			
			// for insert query
			PreparedStatement pst = conn1.prepareStatement("INSERT INTO MYDEPT120 VALUES (?,?,?)");
			pst.setInt(1, num1);
			pst.setString(2, name1);
			pst.setString(3, loc1);
			
			//Update
			
			
			pst.close();
			conn1.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
