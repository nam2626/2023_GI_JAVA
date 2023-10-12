import java.util.Scanner;

public class E11_Quest5 {
	/*
	 * 		숫자 입력 : 6
	 * 				줄번호	별개수	공백개수
	 * 		     *	1		1		5	
	 * 		    **	2		2		4
	 * 		   ***	3		3		3
	 * 		  ****	4		4		2
	 * 		 *****	5		5		1
	 * 		******	6		6		0
	 * 
	 * 		위 예시와 같은 삼각형 출력하는 코드를 작성
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

















