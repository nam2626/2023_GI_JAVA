package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class UpdateEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 수정을 시작합니다...........");
		System.out.print("수정할 사원 번호 : ");
		String employeeNo = sc.nextLine();
		
		EmployeeVO vo = EmployeeService.getInstance().searchEmployee(employeeNo);
		
		if(vo == null) {
			System.out.println("수정할 사원 정보가 없습니다.");
			return;
		}
		
		System.out.print("수정할 사원명 : ");
		vo.setEmployeeName(sc.nextLine());
		System.out.print("수정할 부서명 : ");
		vo.setDepartment(sc.nextLine());
		System.out.print("수정할 급여 : ");
		vo.setSalary(sc.nextInt()); sc.nextLine();
		
		System.out.println("사원 정보 수정 완료");
		
	}

}








