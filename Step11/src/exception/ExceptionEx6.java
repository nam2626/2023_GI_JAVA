package exception;

import java.util.Scanner;

public class ExceptionEx6 {
	public static int div(int n1, int n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();

		try {
			if (n2 == 0)
				throw new UserException("0으로 나눌수 없습니다.");
			System.out.println("결과 출력 : " + div(n1, n2));
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}

}





