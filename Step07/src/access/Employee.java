package access;

public class Employee {
	//사번
	String employeeNo;
	//이름
	String employeeName;
	//급여
	int salary;
	//부서명
	String department;
	//전체필드 초기화하는 생성자
	public Employee(String employeeNo, String employeeName, int salary, String department) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	
	//사원정보 출력하는 메서드
	void printEmployeeInfo(){
		System.out.printf("%s %s %d %s\n",employeeNo,employeeName,salary,department);
	}
}









