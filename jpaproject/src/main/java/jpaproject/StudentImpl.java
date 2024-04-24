package jpaproject;

import java.util.List;

import javax.persistence.*;

import studentexception.*;

public class StudentImpl implements StudentInterface {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA"); 
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction trans = em.getTransaction();
	

	public void addStudent(Student obj) throws StudentAlreadyFoundException {
		// TODO Auto-generated method stub
		
		
	}

	public Student getStudent(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudent(Student obj) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
