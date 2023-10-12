
public class E14_RandomTest {

	public static void main(String[] args) {
		//(int)(랜덤 * (최대값 - 최소값 + 1)) + 최소값
		//1~10		
		for (int i = 0; i < 10; i++) {
			System.out.print((int) (Math.random() * 10) + 1 + " ");
		}
		System.out.println();
		// 7~15
		for (int i = 0; i < 10; i++) {
			System.out.print((int) (Math.random() * 9) + 7 + " ");
		}
		System.out.println();
		// 로또번호 뽑기
		for (int i = 0; i < 10; i++) {
			System.out.print((int) (Math.random() * 45) + 1 + " ");
		}
		
	}

}
