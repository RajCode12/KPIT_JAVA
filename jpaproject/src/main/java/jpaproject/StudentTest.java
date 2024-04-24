package jpaproject;

import javax.persistence.*;
import javax.transaction.Transaction;

public class StudentTest extends StudentImpl {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA"); 
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		trans.begin();
		
		trans.commit();
		
	}
}
