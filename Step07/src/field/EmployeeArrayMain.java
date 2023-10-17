package field;

import java.util.Scanner;

public class EmployeeArrayMain {

	public static void main(String[] args) {
		//길이가 3인 Employee형 배열을 생성
		Employee[] arr = new Employee[3];
		Scanner sc = new Scanner(System.in);
		
		//배열에 Employee 데이터를 Scanner를 이용해서 입력을 받아서 저장
		for (int i = 0; i < arr.length; i++) {
			//1. 객체 생성
			arr[i] = new Employee();
			//2. 데이터 입력
			System.out.print("사번 : ");
			arr[i].employeeNo = sc.nextLine();
			System.out.print("이름 : ");
			arr[i].name = sc.nextLine();
			System.out.print("부서명 : ");
			arr[i].department = sc.nextLine();
			System.out.print("급여 : ");
			arr[i].salary = sc.nextInt();
			sc.nextLine();
			
		}
		//배열에 저장된 모든 데이터를 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].employeeNo + " " + arr[i].name 
					+ " " + arr[i].department + " " + arr[i].salary);

		}
	}

}





