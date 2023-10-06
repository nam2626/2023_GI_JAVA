
public class E01_VariableType {
	/*
	 * 		변수 타입
	 * 			정수형 : byte(1) short(2) int(4) long(8)
	 * 			실수형 : float(4) double(8)
	 * 			문자형 : char(2)
	 * 			논리형 : boolean(1)
	 */
	public static void main(String[] args) {
		long l = 4294967296L;
		System.out.println(l);
		
		short s = 100;
		System.out.println(s);
		
		byte b = 127;
		System.out.println(b);
		b++;
		System.out.println(b);
		
		double d = 3.1415;
		System.out.println(d);
		
		float f = 3.1415F;
		System.out.println(f);
		
		boolean bl = true;
		System.out.println(bl);
		bl = false;
		System.out.println(bl);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 'B';
		System.out.println(ch2);
		
		int i1 = ch1, i2 = ch2;
		System.out.println(i1);
		System.out.println(i2);
		
		i1 = 'a';
		System.out.println(i1);
		
		char ch3 = '가';
		int i3 = ch3;
		System.out.println(i3 + " " + ch3);
		
		//문자열
		String str = "안녕하세요";
		System.out.println(str);
		str = "Hello World";
		System.out.println(str);
	}

}









