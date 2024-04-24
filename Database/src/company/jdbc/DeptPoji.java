package company.jdbc;

import java.util.List;

import company.dept.Department;

public interface DeptPoji {
	void createDepartment(Department deptObj);
	void readDepartment(int id);
	void readAllDepartments();
	void updateDepartment(Department deptObj);
	void deleteDepartment(int id);
}
