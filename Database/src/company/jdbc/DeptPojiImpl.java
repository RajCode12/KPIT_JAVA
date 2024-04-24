package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.hsqldb.jdbcDriver;

import company.dept.Department;

public class DeptPojiImpl implements DeptPoji{
	Connection conn = null;
	public DeptPojiImpl() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Loaded...");
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection established with database...");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void createDepartment(Department dept) {
		try {
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPARTMENT VALUES (?,?,?)");
			pst.setInt(1,dept.getDeptNumber());
			pst.setString(2,dept.getDeptName());
			pst.setString(3,dept.getDeptLocation());
			
			int rows = pst.executeUpdate();
			System.out.println("Rows executed : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void readDepartment(int id) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM DEPARTMENT WHERE DEPT_NUMBER=" + "'" +id+"'"); 
			
			System.out.println("Id : " + rs.getInt(1));
			System.out.println("Dept Name : " + rs.getString(2));
			System.out.println("Dept Location : " + rs.getString(3));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readAllDepartments() {
		try {
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM DEPARTMENT"); 
			
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Dept Name : " + rs.getString(2));
				System.out.println("Dept Location : " + rs.getString(3));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateDepartment(Department dept) {
		try {

			
			PreparedStatement pst = conn.prepareStatement("UPDATE DEPARTMENT SET DEPT_NAME=?,DEPT_LOC=? WHERE DEPT_NUMBER=?");
			pst.setString(1,dept.getDeptLocation());
			pst.setString(2,dept.getDeptName());
			pst.setInt(3,dept.getDeptNumber());
			
			int rows = pst.executeUpdate();
			System.out.println("Rows executed : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteDepartment(int id) {
		try {
			
			PreparedStatement pst = conn.prepareStatement("DELETE FROM DEPARTMENT WHERE DEPT_NUMBER=" + "'"+id+"'");
//			pst.setInt(1,id);
			
			int rows = pst.executeUpdate();
			System.out.println("Rows executed : " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
