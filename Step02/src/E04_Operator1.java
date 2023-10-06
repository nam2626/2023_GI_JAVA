
public class E04_Operator1 {
	/*
	 * 		사칙 연산자
	 * 			+	덧셈
	 * 			-	뺄셈
	 * 			*	곱셈
	 * 			/	나눗셈 - 몫
	 * 			%	나눗셈 - 나머지
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 해서 임의의 값으로 초기화
		int n1 = 10, n2 = 7;
		int result = 0;
		
		result = n1 + n2;
		//n1과 n2의 덧셈 결과를 result에 저장, 이때 n1과 n2의 값은 안바뀐다.
//		n1 = 100;
		System.out.println(result);
		result = n1 - n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		result = n1 % n2;
		System.out.println(result);
		
		//실수형 변수 2개 선언 후 임의의 값으로 초기화
		//사칙연산 결과 출력
		double d1 = 23.432, d2 = 12.235;
		double dResult = 0.0;
		
		dResult = d1 + d2;
		System.out.println(dResult);
		dResult = d1 - d2;
		System.out.println(dResult);
		dResult = d1 * d2;
		System.out.println(dResult);
		dResult = d1 / d2;
		System.out.println(dResult);
		dResult = d1 % d2;
		System.out.println(dResult);
	}

}












