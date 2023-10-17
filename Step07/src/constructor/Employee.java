package constructor;

public class Employee {
	String employeeNo;
	String employeeName;
	String department;
	int salary;
	public Employee(String employeeNo, String employeeName, String department, int salary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
}
