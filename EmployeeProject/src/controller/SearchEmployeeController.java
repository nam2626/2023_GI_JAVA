package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class SearchEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 검색을 시작합니다...........");
		System.out.print("검색할 사원 번호 : ");
		String employeeNo = sc.nextLine();
		
		EmployeeVO vo = EmployeeService.getInstance().searchEmployee(employeeNo);
		
		if(vo == null)
			System.out.println(employeeNo + "사원번호에 해당하는 검색 결과가 없습니다.");
		else
			vo.printEmployeeInfo();
	}

}







