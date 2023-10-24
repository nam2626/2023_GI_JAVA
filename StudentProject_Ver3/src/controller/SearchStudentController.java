package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 검색......");
		
		System.out.print("검색할 학생의 학번 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudentNo(studentNo);
		
		if(vo == null)
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		else
			System.out.println("검색결과\n" + vo);
	}
}







