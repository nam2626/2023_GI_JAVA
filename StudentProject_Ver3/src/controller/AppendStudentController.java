package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class AppendStudentController extends Controller {

	@Override
	public void execute(Scanner sc) {
		//학생정보 등록을 받음
		System.out.println("\n학생정보 등록을 시작합니다...........");
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String studentName = sc.nextLine(); 
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		//Service클래스로 등록할 정보를 보내고, 결과를 받음
		boolean result = StudentService.getInstance().appendStudent(
				new StudentVO(studentNo, studentName, major, score));
		
		if(result)
			System.out.println("학생 정보 등록 성공");
		else
			System.out.println("학생 정보 등록 실패");
			
		
	}

}









