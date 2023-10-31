package join;

import java.util.Random;

public class DiceThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random r = new Random();
		int count = 0;
		while(true) {
			int dice1 = r.nextInt(6)+1;
			int dice2 = r.nextInt(6)+1;
			count++;
			if(dice1 + dice2 == 12) {
				break;
			}
		}
		System.out.println(getId() + " - " + count);
	}
}


