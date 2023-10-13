import java.util.Arrays;

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
	}
}
