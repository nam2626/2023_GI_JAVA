package ex;

import java.util.Scanner;

public class AirconMain {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메뉴 출력
			System.out.println("1. 에어컨 전원 OnOff");
			System.out.println("2. 온도 Up");
			System.out.println("3. 온도 Down");
			System.out.println("4. 모드변경");
			System.out.println("5. 바람세기 변경");
			System.out.println("6. 바람 각도 조정");
			System.out.println("7. 타이머 설정");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			if(no == 0) break;
			
			aircon.remote(no);
		}
		
	}

}





