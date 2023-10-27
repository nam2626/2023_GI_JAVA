package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class AppendEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 등록을 시작합니다...........");
		System.out.print("등록할 사원 번호 : ");
		String employeeNo = sc.nextLine();
		System.out.print("등록할 사원 이름 : ");
		String employeeName = sc.nextLine();
		System.out.print("등록할 급여 : ");
		int salary = sc.nextInt();sc.nextLine();
		System.out.print("등록할 부서명 : ");
		String department = sc.nextLine();
		
		if(EmployeeService.getInstance().appendEmplyee(new EmployeeVO(employeeNo, employeeName, salary, department))) {
			System.out.println("사원 정보 등록 성공");
		}else {
			System.out.println("사원 정보 등록 실패");
		}
	}

}








