import java.util.Scanner;

public class E16_Quest5 {
	/*
	 * 숫자 두개를 입력 받은 다음 두수의 뺄셈 결과를 무조건 양수로 출력하세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n1 = sc.nextInt();
		
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();
		
//		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		
		int result = n1 - n2;
		result = result < 0 ? -result : result;
		
		System.out.println(result);
	}

}












