package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	//학생정보 저장할 배열
	private StudentVO[] arr;
	//저장할 위치를 나타낼 인덱스 변수
	private int idx;
	
	//생성자에서는 학생정보 배열을 생성, 길이는 5
	public StudentService() {
		arr  = new StudentVO[5];
	}
	
	//학생정보 등록하는 기능
	public void registerStudent(Scanner sc) {
		System.out.println("\n학생정보 등록을 시작합니다...........");
		//1. 학생정보 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String studentName = sc.nextLine();
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		//2. 입력받은 학생정보를 배열에 저장
		//단 배열에 공간이 모자르면 배열개수를 3개씩 증가
		if(idx == arr.length) {
			StudentVO[] temp = new StudentVO[arr.length+3];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		arr[idx++] = new StudentVO(studentNo, studentName, major, score);
		System.out.println("학생정보 등록 완료");
	}
	
}













