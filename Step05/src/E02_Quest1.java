
public class E02_Quest1 {
	/*
	 * 	알파벳 A부터 Z까지 출력
	 * 	단, 대문자와 소문자를 아래 형식으로 출력
	 * 	A - a
	 * 	B - b
	 * 	C - c
	 * ....
	 * 	Z - z
	 * 
	 * char 형 변수
	 * A 와 a의 문자코드값을 이용
	 */
	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " - " + (char)(ch + 32));
		}
	}

}














