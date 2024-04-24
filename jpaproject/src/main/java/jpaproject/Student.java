package jpaproject;

import javax.persistence.*;

//POJO
@Entity
@Table(name="MYDEPT120")
public class Student {
	
	@Id
	@Column(name="Id")// column name of table in database
	private int studentId;// respective variable name in java class
	
	@Column(name="Name")
	private String studentName;
	
	//If you want to change column name -> change update to create in persistence.xml
	// But Do not do it.
	// If you want to rename it -> it will create a new column
	// we can only add new column
	// If you want to delete any column -> go to database then delete it.
	
	@Column(name="Marks")
	private float studentMarks;
	
	@Column(name="Address")
	private String studentAddress;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentAddress=" + studentAddress + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}
