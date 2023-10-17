public class E30_Quest15 {
	/*
	 *  정수형 배열 5행 5열에 해당하는 배열을 생성한뒤
	 *  아래 모양처럼 데이터를 자동으로 채우고 출력하세요
	 *  
	 *  1  2  3  4  5
	 *  16 17 18 19 6
	 *  15 24 25 20 7
	 *  14 23 22 21 8
	 *  13 12 11 10 9  
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int count = 5;//채우는 개수
		int row = 0, col = 0;//가로 세로 인덱스 번호
		int num = 1, sw = 1;
		
		while(true) {
			//가로 방향으로 채움
			for(int i=0;i<count;i++) {
				arr[row][col] = num++;
				col += sw;
			}
			count--;//가로 방향으로 채우면 채우는 숫자 개수가 감소
			
			//채울 값이 있냐?
			if(count == 0) break;
			
			//세로 방향으로 채움
			col -= sw;
			row += sw;
			for(int i=0;i<count;i++) {
				arr[row][col] = num++;
				row += sw;
			}
			row -= sw;
			col -= sw;
			//인덱스 번호 증감하는 변수의 부호를 변경
			sw = -sw;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int v : arr[i]) {
				System.out.printf("%-2d ",v);
			}
			System.out.println();
		}
		
	}

}















