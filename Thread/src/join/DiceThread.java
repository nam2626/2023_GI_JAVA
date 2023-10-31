package join;

import java.util.Random;
import java.util.Vector;

public class DiceThread extends Thread {
	private static Vector<Integer> list = new Vector<Integer>();
	
	public static double getAverage() {
		int sum = 0;
		
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
		}
		
		
		System.out.println("총합 : " + sum + " " + list.size() );
		return (double)sum / list.size();
	}
	
	
	
	public DiceThread(String name) {
		super(name);
	}



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
		list.add(count);
		System.out.println(getName() + "@" + count);
	}
}


