
public class E04_LoopInLoop {
	//구구단 2~9단 까지 출력
	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			System.out.printf("--%d 단--\n",i);
			//1~9까지 곱한 결과
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		System.out.println("---------------------");
		//while로 변경
		int i=2 ,j=1;
		while(i<10) {
			System.out.printf("--%d 단--\n",i);
			j = 1;
			while(j < 10) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
		}
	}

}








