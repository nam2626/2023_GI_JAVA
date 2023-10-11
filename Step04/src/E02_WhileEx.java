
public class E02_WhileEx {
	/*
	 * 1~100까지 숫자를 출력
	 */
	public static void main(String[] args) {
		int i = 0;
		
//		case 1
		while(++i < 101 ) 
			System.out.println(i);
		
//		case 2
		while(i++ < 100 ) 
			System.out.println(i);
		
//		case 3
		while(i<100) {
			i++;
			System.out.println(i);
		}
	}

}
