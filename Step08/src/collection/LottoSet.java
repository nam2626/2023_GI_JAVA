package collection;

import java.util.Random;
import java.util.TreeSet;

public class LottoSet {
	public static void main(String[] args) {
		/*
		 * TreeSet을 이용해서 처리
		 * 로또번호 1셋트를 완성해서 출력
		 * 로또번호 1~45, 중복된 번호 나오면 X
		 */
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		
		while(set.size() < 6)
			set.add(r.nextInt(45)+1);
		
		System.out.println(set);
		
	}
}






