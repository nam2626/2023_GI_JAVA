package has_a_1;

public class PoliceMain {

	public static void main(String[] args) {
		Police police = new Police();
		for(int i=0;i<20;i++)
			police.shot();
		
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
		police.useHandCuffs();
	}

}
