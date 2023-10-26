package power;
/*
 * 	PowerOnOff를 상속받은 클래스를 저장할 리스트를 생성
 * 
 *  생성자에서는 미리 기기를 3개정도 생성해서 저장
 *  
 *  외부로부터 새로운 기기를 받아서 리스트에 등록하는 메서드 작성
 *  단, 등록할수있는 기기는 10개까지, 10개가 되면 '더 이상 등록할 수 없습니다'라는 메세지 출력
 * 
 */

import java.util.ArrayList;

public class IotApp {
	//리스트 선언
	private ArrayList<PowerOnOff> list;
	//생성자
	public IotApp() {
		list = new ArrayList<PowerOnOff>();
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Light());
	}
	
	//디바이스 추가
	public void addDevice(PowerOnOff device) {
		if(list.size() < 10) {
			if(device == null) return;
			list.add(device);
			System.out.println(device.getClass().getSimpleName() + " 기기 등록 완료");
		}else {
			System.out.println("더 이상 등록할 수 없습니다, 기기는 최대 10개까지 등록 가능합니다.");
		}
	}
	
	//디바이스 전체 전원 On
	public void deviceAllPowerOn() {
		for(PowerOnOff device : list) {
			device.powerOn();
		}
	}
	//디바이스 전체 전원 Off
	public void deviceAllPowerOff() {
		for(PowerOnOff device : list) {
			device.powerOff();
		}
	}
	
	
}
















