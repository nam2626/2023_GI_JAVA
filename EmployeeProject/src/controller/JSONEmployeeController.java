package controller;

import java.util.Scanner;

import service.EmployeeService;

public class JSONEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("JSON 변환 결과를 출력합니다....");
		String result = EmployeeService.getInstance().employeeToJson();
		
		System.out.println(result);
		
	}

}
