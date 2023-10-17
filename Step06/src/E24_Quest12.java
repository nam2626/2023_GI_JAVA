
public class E24_Quest12 {
	/*
	 * 	2차원 배열 5행 5열 짜리를 선언
	 * 	배열에 데이터를 자동으로 채움
	 * 	
	 * 	1  2  3  4  5
	 *  10 9  8  7  6
	 * 	11 12 13 14 15
	 *  20 19 18 17 16
	 *  21 22 23 24 25
	 *  
	 *  전체 출력
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sw = 1, col = 0, count = 1;
		
		for(int i=0;i<arr.length;i++) {
			while(col < arr.length && col >= 0) {
				arr[i][col] = count++;
				col += sw;
			}
			sw = -sw;
			col += sw;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int n : arr[i]) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}
