package DAOProject2;

import java.util.*;

public class DAOTest2 {

	public static void main(String[] args) {
		
	}
}
class Employee {
	int id;
	String name;
	String dept;
	int salary;
	String job;
	String date;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", job=" + job
				+ ", date=" + date + "]";
	}
	
}

interface EmployeeDAO {
	Employee getEmployee(int id);
	List<Employee> getEmployeeList();
	void insertEmployee(Employee empObj);
	void updateEmployee(Employee empObj);
	void deleteEmployee(int id);	
}
class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public Employee getEmployee(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		
		return empList;
	}

	@Override
	public void insertEmployee(Employee empObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee empObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
