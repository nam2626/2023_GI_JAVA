package power;

public class Aircon implements PowerOnOff {

	private boolean power;
	
	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Aircon 전원 On");
		else 
			System.out.println("Aircon 전원 Off");
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("Aircon 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("Aircon 전원 Off");
	}
	
}





