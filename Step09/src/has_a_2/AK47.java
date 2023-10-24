package has_a_2;

public class AK47 extends Gun {

	public AK47() {
		bullet = 28;
	}

	@Override
	public void shot() {
		super.shot();
		super.shot();
	}

	@Override
	public void reload() {
		bullet = 28;
		System.out.println("reload!");
	}
	
	
	
}
