package has_a_3;

import java.util.Scanner;

public class PowerAppMain {
	/*
	 * 1. 기기등록
	 * 2. 전체 전원 On
	 * 3. 전체 전원 Off
	 * 0. 프로그램 종료
	 * 원하시는 메뉴 번호 입력 : 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IotApp app = new IotApp();
		
		int no = 0;
		do {
			//메뉴 출력
			System.out.println("1. 기기등록");
			System.out.println("2. 전체 전원 On");
			System.out.println("3. 전체 전원 Off");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호 입력 : ");
			//메뉴 번호 입력
			no = sc.nextInt();
			
			switch(no) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
		}while(no != 0);
	}

}







