package ex;
/*
 * 	에어컨
 * 		필드
 * 			온도, 전원, 모드, 바람세기, 바람각도, 타이머
 * 		기능
 * 			전원OnOff, 온도Up/Down, 모드변경, 바람세기조정, 타이머설정, 바람각도조정
 * 
 * 		온도 - int -> 18 ~ 32
 * 		전원 - boolean
 * 		모드 - 냉방 - 0, 송풍 - 1, 제습 - 2 - int 
 * 		바람세기 - 약 - 0 중 - 1 강 - 2 자동 - 3 - int
 * 		바람각도 - 자동, 고정 - boolean
 * 		타이머 - int 0~4
 */
public class Aircon {
	private final int MAX_TEMP = 32;
	private final int MIN_TEMP = 18;
	
	//1. 필드
	private boolean power;
	private int temp;
	private int mode;
	private int timer;
	private int windPower;
	private boolean windAngle;
	//2. 생성자 = 기본생성자로 생성해서 알맞는 값으로 초기화
	public Aircon() {
		temp = 24;
	}
	
	//3. 전원켜고 끄는 메서드 작성
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "에어컨 전원 On" : "에어컨 전원 Off");
	}
	
	public void tempUp() {
		if(!power) return;
		//1. 온도가 32도인지 체크
		if(temp < MAX_TEMP) {
			//2. 온도 하나 증가
			temp++;
		}
		//3. 온도 출력
		System.out.println("현재 온도 : " + temp);
	}
	public void tempDown() {
		if(!power) return;
		if(temp > MIN_TEMP)
			temp--;
		System.out.println("현재 온도 : " + temp);
	}
	
	//운전 모드 변경하는 메서드, 0~2, 0 - 냉방모드, 1 - 송풍모드, 2 - 제습모드 라고 출력
	public void changeMode() {
		if(!power) return;
		mode++;
		mode %= 3;
		
		switch(mode) {
		case 0:
			System.out.println("냉방 모드로 전환 합니다.");
			break;
		case 1:
			System.out.println("송풍 모드로 전환 합니다.");
			break;
		case 2:
			System.out.println("제습 모드로 전환 합니다.");
			break;
		}
	}
	//바람세기 : 자동, 약풍, 중풍, 강풍
	public void changeWindPower() {
		if(!power) return;
		
		windPower++;
		windPower %= 4;
		
		switch(windPower) {
		case 0:
			System.out.println("바람 세기 : 약풍");
			break;
		case 1:
			System.out.println("바람 세기 : 중풍");
			break;
		case 2:
			System.out.println("바람 세기 : 강풍");
			break;
		case 3:
			System.out.println("바람 세기 : 자동");
			break;
		}
		
	}
	//바람각도 : 자동, 고정
	public void changeWindAngle() {
		if(!power) return;
		windAngle = !windAngle;
		System.out.println(windAngle ? "바람각도 : 자동" : "바람각도 : 고정");
	}
	
	//타이머는 4시간까지만 적용, 1시간뒤 꺼집니다., 타이머를 해제합니다.
	public void setTimer() {
		if(!power) return;
		timer++;
		timer %= 5;
		
		switch(timer) {
		case 0:
			System.out.println("타이머를 해제합니다.");
			break;
		default:
			System.out.println(timer+ "시간뒤 꺼집니다.");
		}
	}
}
















