package inheritance_02;

public class EmployeeMain {
	public static void work(Employee e) {
		e.work();
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		SalaryEmployee s = new SalaryEmployee();
		DispatchEmployee d = new DispatchEmployee();
		
		work(e);
		work(s);
		work(d);
	}

}
