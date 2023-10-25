package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchNameStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 검색을 시작합니다.........");
		System.out.print("검색할 이름 입력 : ");
		String name = sc.nextLine();
		
		ArrayList<StudentVO> list = StudentService.getInstance().searchNameStudent(name);
		
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}







