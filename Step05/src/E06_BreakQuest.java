import java.util.Scanner;

public class E06_BreakQuest {
	/*
	 * 	숫자 0을 입력할 때까지 숫자를 입력 받아서
	 *  0을 입력하면 입력을 멈추고
	 *  그동안 입력한 숫자들의 총합과 평균을 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0, ea = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			
			if(n == 0) break;
			
			total += n;
			ea++;
		}
		
		System.out.println("입력하신 숫자들의 총합 : " + total);
		System.out.println("입력하신 숫자들의 평균 : " + total / (double)ea);
	}

}




