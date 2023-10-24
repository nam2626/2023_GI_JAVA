package has_a_2;


public class PoliceMain {

	public static void main(String[] args) {
		Police police = new Police();
		
		police.changeGun(new K2());
		
		for(int i=0;i<20;i++)
			police.shot();
		
		police.changeGun(new AK47());
		for(int i=0;i<20;i++)
			police.shot();
		
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
	}

}
