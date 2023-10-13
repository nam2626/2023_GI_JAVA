import java.util.Scanner;

public class E16_Quest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이번 영화의 평점을 입력 하세요 : ");
			int score = sc.nextInt();
			
			if(score < 1 || score > 5) {
				System.out.println("평점이 1~5가 아니면 다시 입력");
				continue;
			}
			
			String star = "";
			for(int i=0;i<score;i++) star += "★";
			
			System.out.println("평점 : " + star);
			break;
		}
	}
}







