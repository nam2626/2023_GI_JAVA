package access;
/*
 * 	접근 제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 		
 * 		private : 해당 클래스 내에서만 접근이 가능(외부에서 접근 X)
 * 		protected : 해당 클래스를 상속 받은 자식 클래스들까지 접근이 가능
 * 		default : 접근 제어자를 사용을 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들까지 접근이 가능
 * 		public : 누구나 접근이 가능
 * 
 */
public class Employee {
	//사번
	private String employeeNo;
	//이름
	private String employeeName;
	//급여
	private int salary;
	//부서명
	private String department;
	//전체필드 초기화하는 생성자
	public Employee(String employeeNo, String employeeName, int salary, String department) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	//급여를 수정하는 메서드
	public void setSalary(int salary) {
		if(salary > 0)
			this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	//사원정보 출력하는 메서드
	public void printEmployeeInfo(){
		System.out.printf("%s %s %d %s\n",employeeNo,employeeName,salary,department);
	}
}









