package jpaproject;

import java.util.*;

import studentexception.*;

//Poji
public interface StudentInterface {
	void addStudent(Student obj) throws StudentAlreadyFoundException;
	Student getStudent(int id) throws StudentNotFoundException;
	List<Student> getStudentList();
	void updateStudent(Student obj) throws StudentNotFoundException;
	void deleteStudent(int id) throws StudentNotFoundException;
}
