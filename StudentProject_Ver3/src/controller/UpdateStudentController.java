package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("회원정보 수정을 시작합니다..........");
		System.out.print("수정할 학생번호를 입력하세요 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudentNo(studentNo);
		
		if(vo == null) {
			System.out.println("수정할 데이터가 없습니다.");
			return;
		}
		System.out.print("이름 : ");
		vo.setStudentName(sc.nextLine());
		System.out.print("학과 : ");
		vo.setMajor(sc.nextLine());
		System.out.print("평점 : ");
		vo.setScore(sc.nextDouble());
		sc.nextLine();
		System.out.println("데이터 수정 완료.");
		
	}
}










