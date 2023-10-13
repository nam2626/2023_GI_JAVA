import java.util.Arrays;
import java.util.Scanner;

public class E14_Quest6 {
	public static void main(String[] args) {
		//길이가 10인 정수형 배열을 생성
		int[] arr = new int[10];
		//1~20까지 숫자를 랜덤으로 생성해서 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		//배열의 내용을 출력 Arrays.toString()을 사용
		System.out.println(Arrays.toString(arr));
		
		//삭제할 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 숫자 입력 > ");
		int n = sc.nextInt();
		
		//반복문
		for(int i=0;i<arr.length;i++) {
			//삭제할 숫자가 있는 배열 인덱스를 찾음
			if(arr[i] == n) {
				//배열의 내용을 한칸씩 땡겨오는 작업
				for(int j=i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		
		//배열 내용을 전부 출력
		System.out.println(Arrays.toString(arr));
	}
}






