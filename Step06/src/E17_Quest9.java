import java.util.Arrays;

public class E17_Quest9 {
	/*
	 * 정수형 배열 길이가 6인 배열을 생성
	 * 로또번호 1셋트를 완성해서 출력
	 * 로또번호 1~45, 중복된 번호 나오면 X
	 * 
	 * 반복문 중첩이 들어감
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for(int j=0;j<i;j++) {
				//맨처음 값부터, 마지막에 저장된 값 기준으로 중복된 값이 있는지 체크
				if(arr[i] == arr[j]) {
					//중복된 값이 있으면 맨 마지막에 저장된 값을 다시 저장하게끔 처리
					i--;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}












