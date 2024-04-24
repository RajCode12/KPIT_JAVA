package DAOProject2;

import java.sql.*;
import java.util.*;

public class UpdateTest {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected to the database");
			
			
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
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Employee id to be Updated: ");
			int id = sc1.nextInt();
			
			PreparedStatement pst = conn.prepareStatement("UPDATE EMPLOYEE SET NAME=?,DEPT=?,SALARY=?,JOB=?,JOININGDATE=? WHERE ID=?");
			pst.setString(1,name);
			pst.setString(2,dept);
			pst.setInt(3,salary);
			pst.setString(4,job);
			pst.setString(5,date);
			pst.setInt(6,id);
			
			int rows = pst.executeUpdate();
			System.out.println("Rows Updated : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}