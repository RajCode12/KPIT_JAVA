package DatabaseProject;

import java.sql.*;
import java.util.*;

public class DatabaseTest {
	public static void main(String[] args) {
		//1. load the driver (ctrl+shift+M)
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is registerd...");
				
				
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
			Statement st = conn.createStatement();
			
			//insert data
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			ResultSet rs2 = st.executeQuery("select * from MYDEPT120 where DEPTNO=" + "'"+number+"'" );
			while(rs2.next()) {
				System.out.println("DEPTNO : "+rs2.getInt(1));
				System.out.println("DNAME  : "+rs2.getString(2));
				System.out.println("LOC    : "+rs2.getString(3));
				System.out.println("---------------------");
				
			}
			
			System.out.println("****************************");
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from MYDEPT120");	
			
			while(rs.next()) {
				System.out.println("DEPTNO : "+rs.getInt(1));
				System.out.println("DNAME  : "+rs.getString(2));
				System.out.println("LOC    : "+rs.getString(3));
				System.out.println("---------------------");
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
