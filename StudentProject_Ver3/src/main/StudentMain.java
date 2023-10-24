package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//메뉴출력
			System.out.println("-----학적관리프로그램-----");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 전체 조회");
			System.out.println("6. 석차 1등 조회");
			System.out.println("7. 학생 이름으로 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하시는 번호를 입력하세요 :");
			//메뉴 번호를 입력 받음
			int no = sc.nextInt();
			sc.nextLine();
			//0입력시 반복문 종료
			if(no == 0) break;
			
			//컨트롤러 객체를 받아옴
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);//컨트롤러 실행
		}
	}

}











