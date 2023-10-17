import java.util.Scanner;

public class E31_Quest16 {
	/*
	 * 마방진 문제
	 * https://ko.wikipedia.org/wiki/%EB%A7%88%EB%B0%A9%EC%A7%84
	 * 
	 * 마방진 생성을 하기위해 행과 열에 해당하는 길이를 입력 받아서
	 * 길이에 해당하는 마방진을 생성하세요. (홀수 차수 마방진)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 마방진(홀수 차수만) > ");
		int size = sc.nextInt();
		
		int row = 0, col = size / 2;
		int num = 1, count = size * size;
		
		int[][] arr = new int[size][size];
		
		while(num <= count) {
			//배열에 값을 저장
			
			//행변호, 열번호를 계산(임시변수)
			//1. 오른쪽 위로 이동이 기본 -> 행번호 -, 열번호 +
			//2. 이동할 위치가 인덱스 범위를 벗어 났느냐? -> 벗어나면 반대로 이동
			//3. 다음 위치에 값이 있냐? 있으면 -> 현재위치 아래로 이동, 없으면 해당 위치로 이동
			//4. 계산한 행번호 열번호를 row, col에 저장
			
			//중간 과정을 출력
			for (int i = 0; i < arr.length; i++) {
				for(int v : arr[i]) {
					System.out.printf("%-3d ",v);
				}
				System.out.println();
			}
		}
		
		
	}

}








