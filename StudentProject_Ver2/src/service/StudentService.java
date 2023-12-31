package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	//학생정보 저장할 배열
	private ArrayList<StudentVO> list;
	
	public StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("1111", "홍길동", "컴퓨터공학과", 3.1));
		list.add(new StudentVO("2222", "김철수", "경영학과", 2.3));
		list.add(new StudentVO("3333", "이기영", "생활체육학과", 4.2));
		list.add(new StudentVO("4444", "박영수", "법학과", 1.5));
	}
	
	//학생정보 등록하는 기능
	public void registerStudent(Scanner sc) {
		System.out.println("\n학생정보 등록을 시작합니다...........");
		//1. 학생정보 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		if(list.contains(new StudentVO(studentNo, null, null, 0))) {
			System.out.println("동일한 학번이 있는 학생이 있습니다. 기능을 종료합니다.");
			return;
		}
		System.out.print("이름 : ");
		String studentName = sc.nextLine(); 
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		//2. 입력받은 학생정보를 리스트에 저장
		list.add(new StudentVO(studentNo, studentName, major, score));
		
		System.out.println("학생정보 등록 완료");
	}

	public void printAllStudent() {
		System.out.println("학생 정보 전체 출력.....");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(getRank(list.get(i).getScore())+" "+ list.get(i));
		}
	}
	
	private int searchStudentNo(String studentNo) {
		return list.indexOf(new StudentVO(studentNo, null, null, 0));
	}
	
	public void searchStudent(Scanner sc) {
		System.out.println("학생정보 검색......");
		
		System.out.print("검색할 학생의 학번 : ");
		String studentNo = sc.nextLine();
		
		int i = searchStudentNo(studentNo);
		
		if(i == -1)
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		else
			System.out.println("검색결과\n" + list.get(i));
		
	}

	public void updateStudent(Scanner sc) {
		System.out.println("학생정보 수정......");
		
		System.out.print("수정할 학생의 학번 : ");
		String studentNo = sc.nextLine();
		
		int i = searchStudentNo(studentNo);
		
		if(i == -1)
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		else {
			System.out.print("이름 : ");
			list.get(i).setStudentName(sc.nextLine());
			System.out.print("학과 : ");
			list.get(i).setMajor(sc.nextLine());
			System.out.print("평점 : ");
			list.get(i).setScore(sc.nextDouble());
			sc.nextLine();
			System.out.println("데이터 수정 완료.");
		}
		
	}

	public void deleteStudent(Scanner sc) {
		System.out.println("학생정보 삭제......");
		
		System.out.print("삭제할 학생의 학번 : ");
		String studentNo = sc.nextLine();
		
		if(list.remove(new StudentVO(studentNo, null, null, 0)))
			System.out.println("데이터 삭제 완료");
		else 
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
	}

	private int getRank(double score) {
		int rank = 1;
		
		for(int i=0;i<list.size();i++) {
			if(score < list.get(i).getScore())
				rank++;
		}
		
		return rank;
	}

	public void maxRankStudent() {
		System.out.println("석차 1등.........");
		
		for(int i=0;i<list.size();i++) {
			if(getRank(list.get(i).getScore()) == 1) {
				System.out.println(list.get(i));
				break;
			}
		}
	}

	public void searchStudentName(Scanner sc) {
		System.out.println("학생정보 검색......");
		
		System.out.print("검색할 학생의 이름 : ");
		String studentName = sc.nextLine();
	
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStudentName().indexOf(studentName) != -1)
				System.out.println(list.get(i));
		}
		System.out.println();
	}
}













