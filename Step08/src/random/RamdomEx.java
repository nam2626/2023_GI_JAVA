package random;

import java.util.Random;

public class RamdomEx {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());
		//r.nextInt(최대값 + 1 - 최소값) + 최소값
		System.out.println(r.nextInt(45)+1);
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
	}

}
