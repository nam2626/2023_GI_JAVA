package ex;
/*
 * 	TV 클래스
 * 		필드
 * 			전원, 채널, 음량, 음소거
 * 		기능
 * 			전원OnOff, 채널Up/Down, 음량Up/Down, 음소거OnOff
 * 
 * 		전원 - boolean
 * 		채널 - int : 1~356
 * 		음량 - int : 0 ~ 40
 * 		음소거 - boolean
 * 
 * 		기본 생성자만 생성 - 초기값은 알맞게 임의값으로 초기화
 * 		TV 테스트 하는 클래스 TVMain도 생성해서 기능을 만들때마다 테스트하면서 구현
 * 
 */
public class TV {
	private boolean power;
	private int channel;
	private int volume;
	private boolean mute;
	
	private final int MAX_CHANNEL = 356;
	private final int MIN_CHANNEL = 1;
	private final int MAX_VOLUME= 40;
	private final int MIN_VOLUME= 0;
	
	public TV() {
		channel = 9;
		volume = 15;
	}
	
	public void powerOnOff() {
		power = !power;
		System.out.println(power ? "TV 전원 On" : "TV 전원 Off");
	}
	
	public void channelUp() {
		if(!power) return;
		
		channel %= 356;
		channel++;
		
		System.out.println("현재 채널 : " + channel);
	}
	
	public void channelDown() {
		if(!power) return;
		
		if(channel > MIN_CHANNEL)
			channel--;
		else
			channel = MAX_CHANNEL;
		
		System.out.println("현재 채널 : " + channel);
		
	}
	
	public void volumeUp() {
		if(!power) return;
		if(mute) {
			muteOnOff();
		}else {
			if(volume < MAX_VOLUME) volume++;
		}
		System.out.println("현재 음량 : " + volume);
	}

	public void volumeDown() {
		if(!power) return;
		if(mute) {
			muteOnOff();
		}else {
			if(volume > MIN_VOLUME) volume--;
		}
		System.out.println("현재 음량 : " + volume);
	}
	
	public void muteOnOff() {
		if(!power) return;
		mute = !mute;
		System.out.println(mute ? "음소거 활성화" : "음소거 비활성화");
	}
	
	public void remote(int n) {
		switch(n) {
		case 1:
			powerOnOff();
			break;
		case 2:
			channelUp();
			break;
		case 3:
			channelDown();
			break;
		case 4:
			volumeUp();
			break;
		case 5:
			volumeDown();
			break;
		case 6:
			muteOnOff();
			break;
		}
	}
	
	
}














