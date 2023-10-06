import java.util.Scanner;

public class E03_InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		//입력 받음
		int n = sc.nextInt();
		System.out.println(n);
		
		//숫자 하나더 입력을 받아서 n에 입력된 값과 더해서 출력
		//1. 변수 선언
		int m = 0;
		//2. 숫자 입력
		m = sc.nextInt();
		//3. 더한값 출력
		System.out.println(n+m);
		
	}

}





