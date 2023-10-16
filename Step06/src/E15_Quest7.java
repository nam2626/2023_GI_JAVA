import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class E15_Quest7 {
	/*
	 *  길이가 5인 정수형 배열을 생성한 후에
	 *  숫자를 입력받아 배열에 저장, 단 배열이 가득차면 배열의 길이를 3씩 늘림
	 *  -1 입력시 입력 종료 후 전체 배열 출력
	 *  
	 *  삭제할 숫자를 입력받아서
	 *  배열에 있는 숫자를 삭제 처리 후 배열에 빈자리를 메꿈
	 *  전체 배열 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = -1;
		do {
			i++;
			if(i == arr.length) {
				int[] temp = new int[arr.length+3];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr = temp;
			}
			System.out.print(i + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}while(arr[i] != -1);
		
		System.out.print("삭제할 숫자 입력 : ");
		int del = sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			if(arr[j] == del) {
				for (int z = j; z < i-1; z++) {
					arr[z] = arr[z+1];
				}
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}












