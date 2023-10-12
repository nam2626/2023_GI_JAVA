import java.util.Scanner;

public class E03_Quest2 {
	/*
	 * 	숫자 하나를 입력 받아서
	 * 	입력 받은 숫자 만큼 정수를 입력 받아서
	 * 	입력 받은 정수의 총합과 평균을 출력
	 * 	단, 평균을 출력 했을때 소수점도 같이 출력
	 * 
	 * 	실행 예>
	 * 		입력받을 숫자 개수 : 5
	 * 		숫자 입력 : 1
	 * 		숫자 입력 : 2
	 * 		숫자 입력 : 3
	 * 		숫자 입력 : 4
	 * 		숫자 입력 : 6
	 * 		입력하신 숫자들의 총합 : 16
	 * 		입력하신 숫자들의 평균 : 3.2
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 숫자 개수 입력 > ");
		int ea = sc.nextInt();
		int total = 0;
		
		for(int i=0;i<ea;i++) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			total += n;
		}
		System.out.println("입력하신 숫자들의 총합 : " + total);
		System.out.println("입력하신 숫자들의 평균 : " + total / (double)ea);
	}

}












