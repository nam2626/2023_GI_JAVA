import java.util.Arrays;

public class E23_Quest11 {
	/*
	 * 	2차원 배열을 선언해서
	 * 	로또번호를 총 5셋트 저장 (5행 6열)
	 * 	생성한 전체 로또 번호를 출력
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][6];
		
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random() * 45) + 1;
				for(int k=0;k<j;k++) {
					if(arr[i][j] == arr[i][k]) {
						j--;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(arr[i]));	
		}
	}
}





