
public class E15_Quest7 {
	public static void main(String[] args) {
		//주사위를 두번 굴려서 더블이 나올때까지 굴리기
		// 1 1, 2 2, 3 3, 4 4, 5 5, 6 6
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.printf("%d %d\n",dice1,dice2);
			if(dice1 == dice2) break;
		}
	}
}
