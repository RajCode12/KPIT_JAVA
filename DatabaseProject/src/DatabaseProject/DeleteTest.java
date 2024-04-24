package DatabaseProject;

import java.sql.*;
import java.util.*;

public class DeleteTest {
	public static void main(String[] args) {
		//1. load the driver (ctrl+shift+M)
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is registerd...");
				
				
			Connection conn1 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			//Update
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Which dept to delete ?");
			int num1 = sc1.nextInt();
			
			// for insert query
			PreparedStatement pst = conn1.prepareStatement("DELETE FROM MYDEPT120 where DEPTNO=?");
			pst.setInt(1, num1);
			int rows = pst.executeUpdate();
			// commit to confirm 
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Are you sure to delete?");
			String reply = sc2.nextLine();
			if(reply.equalsIgnoreCase("Yes")) {
				conn1.commit();
			} else {
				conn1.rollback();
			}
			pst.close();
			conn1.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

