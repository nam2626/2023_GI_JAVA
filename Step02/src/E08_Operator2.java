
public class E08_Operator2 {
	/*
	 * 		복합 대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 			+=	-=	*=	/=	%=
	 */
	public static void main(String[] args) {
		int n = 10;
		//n = n + 10;
		n += 10;
		System.out.println(n);
		n -= 5;
		System.out.println(n);
		n *= 3;
		System.out.println(n);
		n /= 7;
		System.out.println(n);
		n %= 3;
		System.out.println(n);
		//-----------------------------
		String address = "서울시 ";
		address += "강서구 ";
		address += "화곡동 ";
		address += "OO빌라 101호 ";
		System.out.println(address);
	}

}






