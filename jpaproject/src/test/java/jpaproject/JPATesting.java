package jpaproject;//junit5

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class JPATesting {
	public JPATesting() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA"); 
		EntityManager em = emf.createEntityManager();
		
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("1");
	}
	@Test
	public void testCase2() {
		System.out.println("2");
	}
	@Test
	public void testCase3() {
		System.out.println("3");
	}
	@Test
	public void testCase4() {
		System.out.println("4");
	}
	@Test
	public void testCase5() {
		System.out.println("5");
	}
}
