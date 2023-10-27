package controller;

import java.util.Scanner;

import service.EmployeeService;

public class DeleteEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 삭제를 시작합니다...........");
		System.out.print("삭제할 사원 번호 : ");
		String employeeNo = sc.nextLine();
		
		if(EmployeeService.getInstance().deleteEmployee(employeeNo))
			System.out.println("사원 정보 삭제 완료");
		else
			System.out.println("사원 정보 삭제 실패");
			
	}

}
