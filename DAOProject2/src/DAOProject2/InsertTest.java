package DAOProject2;

import java.sql.*;
import java.util.*;

public class InsertTest {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the database");
			
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Employee id : ");
			int id = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Employee Name : ");
			String name = sc2.nextLine();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter Employee Dept : ");
			String dept = sc3.nextLine();
			
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter Employee Salary : ");
			int salary = sc4.nextInt();
			
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Enter Employee Job : ");
			String job = sc5.nextLine();
			
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Enter Employee Joining Date : ");
			String date = sc6.next();
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?,?,?)");
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,dept);
			pst.setInt(4,salary);
			pst.setString(5,job);
			pst.setString(6,date);
			
			int rows = pst.executeUpdate();
			System.out.println("Rows Updated : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
