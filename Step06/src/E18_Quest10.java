import java.util.Scanner;

public class E18_Quest10 {
	/*
	 * 컴퓨터와 가위바위보를 5번 진행을 해서 
	 * 사용자의 승무패를 출력
	 * 
	 * 가위 -  2, 바위 - 1, 보 - 3
	 * 
	 * 컴퓨터는 랜덤으로 1~3까지 숫자를 뽑음
	 * 사용자로부터는 1~3까지 숫자를 입력 받음
	 * 
	 * ------- 1회차 ----------
	 * 가위 - 2, 바위 - 1, 보 - 3 입력 하세요 : 1
	 * 사용자는 가위, 컴퓨터는 보, 사용자가 이겼습니다.
	 * 
	 * ....
	 * 
	 * 승 : 2, 무 : 1, 패 : 2
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, d, l;
		w = d = l = 0;
		String[] str = {"바위","가위","보"};
		for(int i=0;i<5; i++) {
			System.out.println("------- " + (i+1) + "회차 -------");
			System.out.print("가위 - 2, 바위 - 1, 보 - 3 입력하세요 : ");
			int player = sc.nextInt();
			int com = (int)(Math.random()*3) + 1;
			
			if(player % 3 + 1 == com) {
				//사용자 승
				System.out.printf("사용자 : %s, 컴퓨터 : %s 사용자가 이겼습니다.\n",str[player-1],str[com-1]);
				w++;
			}else if(player == com) {
				//무승부
				System.out.printf("사용자 : %s, 컴퓨터 : %s 무승부입니다.\n",str[player-1],str[com-1]);
				d++;
			}else {
				//컴퓨터 승
				l++;
				System.out.printf("사용자 : %s, 컴퓨터 : %s 컴퓨터가 이겼습니다.\n",str[player-1],str[com-1]);
			}
		}
		System.out.printf("승 : %d, 무 : %d, 패 : %d\n",w,d,l);
	}

}
















