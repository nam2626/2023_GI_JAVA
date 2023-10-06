import java.util.Scanner;

public class E07_Quest3 {
	/*
	 * 삼각형의 밑변과 높이를 정수로 입력받아서
	 * 입력한 삼각형의 밑변과 높이 값을 이용해서 삼각형의 넓이를 출력
	 * 단, 넓이는 소수점까지 포함
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 변수 선언
		int w = 0, h = 0;
		//2. 밑변, 높이 입력
		System.out.print("삼각형의 밑변 입력 > ");
		w = sc.nextInt();
		System.out.print("삼각형의 높이 입력 > ");
		h = sc.nextInt();
		//3. 삼각형 넓이 계산
		double area = w * h / 2.0;
		//4. 넓이 출력
		System.out.println(area);
	}
}








