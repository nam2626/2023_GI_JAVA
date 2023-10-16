import java.util.Scanner;

public class E27_InsertSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			//1. i번째에 데이터 입력을 받음
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
			//2. 데이터 정렬을 수행 - 반복문
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
			//출력
			for(int n : arr) {
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
	}

}




