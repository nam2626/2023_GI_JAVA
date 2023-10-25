package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class TopRankStudentController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("석차 1등.........");
		
		StudentVO vo = StudentService.getInstance().topRankStudent();
		if(vo == null)
			System.out.println("학생 데이터가 하나도 없습니다.");
		else
			System.out.println(vo);
	}
}
