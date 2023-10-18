package ex;

public class AirconMain {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		aircon.powerOnOff();
		aircon.powerOnOff();
		aircon.powerOnOff();
		
		for(int i=0;i<20;i++)
			aircon.tempDown();
		
		aircon.changeMode();
		aircon.changeMode();
		aircon.changeMode();
		aircon.changeMode();
		aircon.changeMode();
		aircon.changeMode();
	}

}
