import java.util.Scanner;

public class E09_SwitchEx2 {
	/*
	 * 	블랙커피
	 * 		커피 추가
	 * 		뜨거운 물 추가
	 * 	설탕커피
	 * 		설탕 추가
	 * 		커피 추가
	 * 		뜨거운 물 추가
	 * 	밀크커피
	 * 		프림 추가
	 * 		설탕 추가
	 * 		커피 추가
	 * 		뜨거운 물 추가
	 */

	public static void main(String[] args) {
		System.out.println("1. 블랙커피");
		System.out.println("2. 설탕커피");
		System.out.println("3. 밀크커피");
		System.out.println("원하는 번호를 입력하세요 >>> ");
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		switch(no) {
		case 3:
			System.out.println("프림 추가");
		case 2:
			System.out.println("설탕 추가");
		case 1:
			System.out.println("커피 추가");
			System.out.println("뜨거운 물 추가");
		}
		
	}

}







