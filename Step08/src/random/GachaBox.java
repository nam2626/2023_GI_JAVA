package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GachaBox {
	private final int[] GRADE_EA= {14,700,1800,2800,4686};
	
	private static GachaBox instance = new GachaBox();
	
	private GachaBox() {	}

	public static GachaBox getInstance() {
		if(instance == null)
			instance = new GachaBox();
		return instance;
	}

	private String[] generateGachaBox() {
		String[] arr = new String[10000];
		String[] grade = {"S","A","B","C","F"};		
		int[] count = new int[5];
		
		Random r = new Random();
		for(int i=0;i<10000;i++) {
			//1. 0~4까지 숫자를 랜덤하게 뽑음
			int n = r.nextInt(5);
			if(GRADE_EA[n] == count[n]) {
				i--;
				continue;
			}
			//2. arr에 해당 등급의 문자열을 저장
			arr[i] = grade[n];
			//3. count에도 해당 등급의 아이템 개수를 증가
			count[n]++;			
		}
		
		return arr;
	}
	
	
	
	
}





