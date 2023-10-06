import java.util.Scanner;

public class E06_Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 반지름 하나 정수로 입력 받아서 입력 받은 반지름의 원넓이를 출력
		// 단 원넓이는 소수점까지 출력
		//1. 변수 선언
		//2. 반지름 입력 받음
		System.out.print("반지름 입력 > ");
		int r = sc.nextInt();
		//3. 원넓이 계산
		double area = r * r * 3.1415;
		
		//4. 출력
		System.out.println("원넓이 : " + area);
	}

}
