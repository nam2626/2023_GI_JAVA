
public class E05_Quest2 {
	/*
	 * 정수형 배열 길이가 10인 배열을 선언할때 
	 * 원하는 값으로 초기화를 한 후에
	 * 배열에 있는 값들 중 짝수와 홀수의 개수를 출력 
	 * 0은 짝수에 포함을 시킴
	 */
	public static void main(String[] args) {
		int[] arr = {3,43,67,78,2,22,15,53,78,98,77};
		
		int even, odd;
		even = odd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) even++;
			else odd++;
		}
		System.out.println("홀수 개수 : "+odd);
		System.out.println("짝수 개수 : "+even);
	}
}




