package employeeJPAProject.test;

import java.util.List;
import employeeJPAProject.emp.*;

import javax.persistence.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	EntityManager em = null;
	
	EmployeeTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
		System.out.println("Manager created : " + em);
	}
	
	@Test
	public void createEmployee() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setEmployeeName("Raj");
		e.setEmployeeLocation("Bihar");
		em.persist(e);
		
		trans.commit();
	}
	@Test
	public void getEmployee() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Employee e = em.find(Employee.class, 1);
		Assertions.assertTrue(e!=null);
		System.out.println("Employee Id : " + e.getEmployeeId());
		System.out.println("Employee Name : " + e.getEmployeeName());
		System.out.println("Employee Marks : " + e.getEmployeeLocation());
		
		trans.commit();
	}
	@Test
	public void getAllEmployees() {
		Query query = em.createQuery("from StudentTable");//import javax.persistence query
		Assertions.assertTrue(query!=null);
		
		List<Employee> queryList = query.getResultList();
		for(Employee e : queryList) {
			System.out.println("Employee Id : " + e.getEmployeeId());
			System.out.println("Employee Name : " + e.getEmployeeName());
			System.out.println("Employee Marks : " + e.getEmployeeLocation());
			System.out.println("*************************");
		}
	}
	@Test
	public void updateEmployee() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Employee e = em.find(Employee.class,1);
		Assertions.assertTrue(e!=null);
		e.setEmployeeName("Dev");
		e.setEmployeeLocation("Pune");
		em.merge(e);
		
		trans.commit();
	}
	@Test
	public void deleteEmployee() {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		Employee s = em.find(Employee.class,1);
		Assertions.assertTrue(s!=null);
		em.remove(s);
		
		trans.commit();
	}
}
