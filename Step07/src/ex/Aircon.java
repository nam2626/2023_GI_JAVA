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
	//1. 필드
	private boolean power;
	private int temp;
	private int mode;
	private int timer;
	private int windPower;
	private int windAngle;
	//2. 생성자 = 기본생성자로 생성해서 알맞는 값으로 초기화
	public Aircon() {
		temp = 24;
	}
	
	//3. 전원켜고 끄는 메서드 작성
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "에어컨 전원 On" : "에어컨 전원 Off");
	}
}
















