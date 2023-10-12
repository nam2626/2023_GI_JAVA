
public class E13_Quest6 {
	/*
	 * 		삼각함수 표 출력하기
	 * 		각도		사인		코사인	탄젠트
	 * 		1		0.0000	1.0000	0.0000
	 * 		2		0.0715	0.9998	0.0175
	 */
	public static void main(String[] args) {
		for(int i=1;i<91;i++) {
			double radin = Math.toRadians(i);
			if(i!=90)
				System.out.printf("%2d %.4 %.4f %.4f\n",i,Math.sin(radin),Math.cos(radin),Math.tan(radin));
			else
				System.out.printf("%2d %.4f %.4f ∞\n",i,Math.sin(radin),Math.cos(radin));
		}
	}

}
