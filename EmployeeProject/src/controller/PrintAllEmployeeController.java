package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class PrintAllEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 사원 정보를 출력합니다......");
		ArrayList<EmployeeVO> list = EmployeeService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("사원 정보가 하나도 없습니다....");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			list.get(i).printEmployeeInfo();
		}
	}

}












