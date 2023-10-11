import java.util.Scanner;

public class E09_ForEx2 {
	/*
	 *  숫자 하나 입력 받아서
	 *  입력한 숫자의 구구단을 출력
	 * 	
	 * 	실행 예>
	 * 		단 입력 > 2
	 * 		2 * 1 = 2
	 * 		2 * 2 = 4
	 * 		2 * 3 = 6
	 * 		...
	 * 		2 * 9 = 18
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 > ");
		int dan = sc.nextInt();
		
		for(int i = 1;i < 10;i++) 
			System.out.println(dan + " * " + i + " = " + dan * i);
		
	}

}








