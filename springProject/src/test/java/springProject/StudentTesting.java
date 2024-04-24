package springProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.students.*;

public class StudentTesting {
	
	EntityManager em = null;
	
	public StudentTesting() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
		
	}
	@Test
	public void createStudent() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = new Student();
		s.setId(1);
		s.setName("Raj");
		s.setMarks(93.5f);
		s.setAddress("Bihar");
		em.persist(s);
		
		trans.commit();
	}
	@Test
	public void readStudent() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class, 1);
		Assertions.assertTrue(s!=null);
		System.out.println("Student Id : " + s.getId());
		System.out.println("Student Name : " + s.getName());
		System.out.println("Student Marks : " + s.getMarks());
		System.out.println("Student Address : " + s.getAddress());
		
		trans.commit();
	}
	@Test
	public void readAllStudents() {
		Query query = em.createQuery("from StudentTable ");//import javax.persistence query
		Assertions.assertTrue(query!=null);
		
		List<Student> queryList = query.getResultList();
		for(Student s : queryList) {
			System.out.println("Student Id : " + s.getId());
			System.out.println("Student Name : " + s.getName());
			System.out.println("Student Marks : " + s.getMarks());
			System.out.println("Student Address : " + s.getAddress());
			System.out.println("*************************");
		}
	}
	@Test
	public void updateStudent() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class,1);
		Assertions.assertTrue(s!=null);
		s.setName("Dev");
		s.setMarks(94.6f);
		s.setAddress("Bihar");
		em.merge(s);
		
		trans.commit();
	}
	@Test
	public void deleteStudent() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class,1);
		Assertions.assertTrue(s!=null);
		em.remove(s);
		
		trans.commit();
	}
}
