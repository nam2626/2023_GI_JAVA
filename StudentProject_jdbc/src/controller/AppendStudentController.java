package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class AppendStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		//학생정보 등록을 받음
		System.out.println("\n학생정보 등록을 시작합니다...........");
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String studentName = sc.nextLine(); 
		//학과번호 입력 받는 것으로 변경
		System.out.print("학과 번호: ");
		int majorNo = sc.nextInt(); sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		//성별 입력
		System.out.print("성별 : ");
		String gender = sc.nextLine();

		boolean result = StudentService.getInstance().insertStudent(
				new StudentVO(studentNo, studentName, majorNo, score, gender));
		
		if(result)
			System.out.println("학생 정보 등록 성공");
		else
			System.out.println("학생 정보 등록 실패");
			
		
	}

}









