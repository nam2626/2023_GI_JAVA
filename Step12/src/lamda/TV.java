package lamda;
//전원 켜고 끄는 메서드 작성
public class TV {
	private Power power;
	private boolean pow;
	
	public TV(Power power) {
		super();
		this.power = power;
	}
	
	public void powerOnOff() {
		power.powerOnOff();
	}
	
}
