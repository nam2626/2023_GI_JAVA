import java.util.Arrays;

public class E11_ArrayEx6 {
	public static void main(String[] args) {
		//정수형 배열 길이가 5인 배열을 생성해서 값은 임의값으로 초기화
		int[] arr = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr);
		//arr의 길이가 5인 배열을 10으로 늘리기
		//1.임시배열 생성
		int[] temp = new int[10];
		//2.배열의 내용을 임시배열에 복사
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		//3. arr에 임시배열을 연결
		arr = temp;
		//결과 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr);
	}
}







