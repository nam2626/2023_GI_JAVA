package has_a_3;
/*
 * 전원 모듈에서는 전원 값을 저장할 변수
 * 전원을 켜고, 끄는 메서드, 전원OnOff하는 메서드 총 3가지 메서드를 작성
 */
public class PowerOnOff {
	protected boolean power;
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
	}
	
	public void powerOn() {
		power = true;
		System.out.println("전원 On");
	}

	public void powerOff() {
		power = false;
		System.out.println("전원 Off");
	}
}




