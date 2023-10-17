import java.util.Arrays;

public class E29_Quest14 {
	/*
	 * 길이가 10인 정수형 배열을 생성해서 데이터를 랜덤으로 채워 넣은 후
	 * 배열에 있는 내용들의 총합과 값들을 전부 출력하세요
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = (int)(Math.random() * 30) + 1;
			
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
			sum += arr[i];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		
	}

}








