import java.util.Scanner;

public class E06_Quest3 {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 후에
	 * 	정수를 입력받아서 배열의 각 요소에 전부 입력한 후
	 * 	배열에 저장된 값들 중 최대값, 최소값, 총합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 배열 선언
		int[] arr = new int[10];
		//2. 숫자 입력 받아서 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		//3. 최대값 최소값 총합 저장할 변수를 선언하고 초기화
		int max,min,total;
		max = min = total = arr[0];
		//4. 최대값 최소값 총합 연산처리
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
			total += arr[i];
		}
		//5. 결과값 출력
		System.out.println(max);
		System.out.println(min);
		System.out.println(total);
	}
}








