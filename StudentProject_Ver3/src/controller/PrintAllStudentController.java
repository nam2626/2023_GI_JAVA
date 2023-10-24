package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보를 전부 출력합니다.........");
		ArrayList<StudentVO> list = StudentService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("학생 정보가 하나도 없습니다.");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}





