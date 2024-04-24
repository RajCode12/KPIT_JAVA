package company.dept;

//Pojo
public class Department {
	private int deptNumber;
	private String deptName;
	private String deptLocation;
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	@Override
	public String toString() {
		return "DeptPojo [deptNumber=" + deptNumber + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}
}
