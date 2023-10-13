import java.util.Scanner;

public class E17_Quest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
//		boolean flag = n < 2 ? false : true;
//		
//		for(int i=2;i<n;i++) {
//			if(n % i == 0) {
//				flag = false;
//				break;
//			}
//		}
//		
//		if(flag)
//			System.out.println("입력하신 숫자는 소수 입니다.");
//		else
//			System.out.println("입력하신 숫자는 소수가 아닙니다.");
//			
//		int i = 0;
//		
//		for(i=2;i<n;i++) {
//			if(n % i == 0)
//				break;
//		}
//		
//		if(n == i)
//			System.out.println("입력하신 숫자는 소수 입니다.");
//		else
//			System.out.println("입력하신 숫자는 소수가 아닙니다.");
			
		int count = 0;
		
		for(int i=1;i<=n;i++) {
			if(n % i == 0) count++;
		}
		
		if(count == 2)
			System.out.println("입력하신 숫자는 소수 입니다.");
		else
			System.out.println("입력하신 숫자는 소수가 아닙니다.");
	}
}


















