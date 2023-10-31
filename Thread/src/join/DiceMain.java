package join;

import java.util.ArrayList;

public class DiceMain {

	public static void main(String[] args) {
		ArrayList<DiceThread> list = new ArrayList<DiceThread>();
		for(int i=0;i<1000;i++) {
			list.add(new DiceThread());
		}
		list.forEach(a -> a.start());
		list.forEach(a -> {
			try {
				a.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		//종료하기 전에 결과를 출력
		
		System.out.println("main 종료");
	}

}
