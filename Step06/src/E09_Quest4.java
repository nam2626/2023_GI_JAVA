
public class E09_Quest4 {
	/*
	 * 문자형 배열에 저장된 내용을 전부 대문자로 변경 후
	 * 문자열로 만든 다음에 결과를 출력
	 */
	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= 32;
		}
		
		str = new String(arr);
		System.out.println(str);
	}
}
