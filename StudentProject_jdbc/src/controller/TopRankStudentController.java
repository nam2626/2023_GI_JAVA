package controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import service.StudentService;
import vo.StudentVO;

public class TopRankStudentController implements Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("석차 10등까지의 학생정보를 조회 합니다.....");
		
		TreeMap<Integer, ArrayList<StudentVO>> map = StudentService.getInstance().topRankStudent();
		if(map.isEmpty())
			System.out.println("학생 데이터가 하나도 없습니다.");
		else {
			
		}
	}
}
