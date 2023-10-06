import java.util.Scanner;

public class E05_Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 변수 두개 선언 후 정수 두개 입력을 받은 후
		//입력받은 값의 사칙 연산 결과를 각각 출력
		//1. 변수 선언
		int n1 = 0, n2 = 0;
		//2. 입력
		System.out.print("숫자 입력 > ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 > ");
		n2 = sc.nextInt();
		//3. 계산 후 출력
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

}




