import java.util.Scanner;

public class E09_Quest3 {
	/*
	 * 숫자 두개를 입력 받은 후에
	 * 입력 두 숫자의 최대 공약수를 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		int gcd = 0;
		for(int i=1;i<=n1;i++) {
			if(n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.println("두수의 최대 공약수 : "+gcd);
		
	}
}











