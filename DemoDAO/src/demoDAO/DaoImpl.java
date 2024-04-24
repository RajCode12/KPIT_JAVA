package demoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;



public class DaoImpl implements DaoPojo {
	Connection conn = null;
	public DaoImpl() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		try {
			Scanner sc1 = new Scanner(System.in);
			int id = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			String name = sc2.next();
			
			Scanner sc3 = new Scanner(System.in);
			String course = sc3.next();
			
			PreparedStatement st = conn.prepareStatement("INSERT INTO KPIT VALUES (?,?,?)");
			st.setInt(1,id);
			st.setString(2,name);
			st.setString(3,course);
			
			int rows = st.executeUpdate();
			System.out.println("Rows executed : " + rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void read() {
		try {
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
		
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM KPIT where ID=" + "'"+id+"'");
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Course : " + rs.getString(3));
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void readAll() {
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM KPIT");
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Course : " + rs.getString(3));
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter name : ");
			Scanner sc2 = new Scanner(System.in);
			String name = sc2.next();
			
			System.out.println("Enter course : ");
			Scanner sc3 = new Scanner(System.in);
			String course = sc3.next();
			
			System.out.println("Enter the id to be updated");
			Scanner sc1 = new Scanner(System.in);
			int id = sc1.nextInt();
			
			PreparedStatement st = conn.prepareStatement("UPDATE KPIT SET NAME=?,COURSE=? WHERE ID=?");
			st.setString(1,name);
			st.setString(2,course);
			st.setInt(3,id);
			
			int rows = st.executeUpdate();
			System.out.println("Rows executed : " + rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the id to be deleted");
			Scanner sc1 = new Scanner(System.in);
			int id = sc1.nextInt();
			
			PreparedStatement st = conn.prepareStatement("DELETE FROM KPIT WHERE ID=?");
			st.setInt(1,id);
			
			int rows = st.executeUpdate();
			System.out.println("Rows executed : " + rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
