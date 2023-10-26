package power;

import java.util.Scanner;

public class PowerAppMain {
	/*
	 * 기기 등록을 시작합니다.........
	 * 1. TV
	 * 2. Aircon
	 * 3. Light
	 * 등록할 기기번호 입력 : 1
	 * TV 기기 등록완료
	 */
	public static PowerOnOff createDevice(Scanner sc) {
		System.out.println("기기등록을 시작합니다...........");
		System.out.println("1. TV");
		System.out.println("2. Aircon");
		System.out.println("3. Light");
		System.out.print("등록할 기기번호 입력 : ");
		int no = sc.nextInt();
		
		PowerOnOff power = null;
		switch(no) {
		case 1:
			power = new TV();
			break;
		case 2:
			power = new Aircon();
			break;
		case 3:
			power = new Light();
			break;
		}
		return power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IotApp app = new IotApp();
		/*
		 * 1. 기기등록
		 * 2. 전체 전원 On
		 * 3. 전체 전원 Off
		 * 0. 프로그램 종료
		 * 원하시는 메뉴 번호 입력 : 
		 */
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
				PowerOnOff power = createDevice(sc);
				app.addDevice(power);
				break;
			case 2:
				app.deviceAllPowerOn();
				break;
			case 3:
				app.deviceAllPowerOff();
				break;
			}
		}while(no != 0);
	}

}







