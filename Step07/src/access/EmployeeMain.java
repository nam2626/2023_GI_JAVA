package access;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("1111", "홍길동", 2000, "개발부");
		emp1.salary = -1000;
		emp1.printEmployeeInfo();
	}

}
