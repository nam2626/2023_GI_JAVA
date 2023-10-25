package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제......");   

		System.out.print("삭제할 학생의 학번 : ");
		String studentNo = sc.nextLine();
		
		if(StudentService.getInstance().deleteStudent(studentNo))
			System.out.println("학생정보 삭제 완료");
		else
			System.out.println("학번에 해당하는 학생이 없습니다.");
	}
}







