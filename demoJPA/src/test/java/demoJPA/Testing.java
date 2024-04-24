package demoJPA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import demoJPA.*;

public class Testing {
	EntityManager em = null;
	public Testing() {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
			em = emf.createEntityManager();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void create() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = new Student();
		s.setId(2);
		s.setName("Dev");
		s.setCourse("Cpp");
		em.persist(s);
		
		trans.commit();
		
	}
	@Test
	public void read() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class,1);
		System.out.println("Id : " + s.getId());
		System.out.println("Name : " + s.getName());
		System.out.println("Id : " + s.getCourse());
		
		
		trans.commit();
	}
	@Test
	public void readAll() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Query query = em.createQuery("from STUDENT");
		Assertions.assertTrue(query!=null);
		List<Student> list = query.getResultList();
		for(Student s : list) {
			System.out.println("Id : " + s.getId());
			System.out.println("Name : " + s.getName());
			System.out.println("Id : " + s.getCourse());
		}
		
		trans.commit();
	}
	@Test
	public void update() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class,1);
		s.setName("Abhay");
		s.setCourse("WebD");
		em.merge(s);
		
		trans.commit();
		
	}
	@Test
	public void delete() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Student s = em.find(Student.class,1);
		Assertions.assertTrue(s!=null);
		em.remove(s);
		
		trans.commit();
		
	}
}
