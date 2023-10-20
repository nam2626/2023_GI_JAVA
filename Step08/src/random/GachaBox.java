package random;

import java.util.Random;

public class GachaBox {
	private final int[] GRADE_EA;
	private final int BOX_EA = 100000;
	private static GachaBox instance = new GachaBox();
	
	private GachaBox() {
		GRADE_EA = new int[]{(int)(0.14 * BOX_EA), (int)(7 * BOX_EA), (int)(18 * BOX_EA),
				(int)(28 * BOX_EA), (int)(46.86 * BOX_EA)};
	}

	public static GachaBox getInstance() {
		if(instance == null)
			instance = new GachaBox();
		return instance;
	}

	private String[] generateGachaBox() {
		String[] arr = new String[BOX_EA];
		String[] grade = {"S","A","B","C","F"};		
		int[] count = new int[5];
		
		Random r = new Random();
		for(int i=0;i<BOX_EA;i++) {
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
	
	public String[] drawItem(int ea) {
		String[] arr = new String[ea];
		final String[] gachar = generateGachaBox();
		int[] temp = new int[ea];
		Random r = new Random();
		//뽑기를 총 ea 번째
		for(int i=0;i<ea;i++) {
			//똑같은 숫자를 뽑으면 안됨
			int n = r.nextInt(gachar.length);
			temp[i]=n;
			for(int j=0;j<i;j++) {
				if(temp[j] == n) {
					i--;
					break;
				}
			}
		}
		//가챠박스에 있는 내용을 arr에 저장
		for(int i=0;i<temp.length;i++) {
			arr[i] = gachar[i];
		}
		return arr;
	}
	
	
}





