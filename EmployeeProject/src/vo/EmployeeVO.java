package vo;

import java.util.Objects;

public class EmployeeVO {
	private String employeeNo;
	private String employeeName;
	private int salary;
	private String department;

	public EmployeeVO(String employeeNo, String employeeName, int salary, String department) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EmployeeVO))
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		return Objects.equals(employeeNo, other.employeeNo);
	}

}
