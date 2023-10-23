package wrapper;

public class WrapperClass {
	/*
	 * 	Wrapper 클래스는 primitive 변수 타입을 reference 형 타입으로 바꿀때 사용되는 클래스
	 * 
	 *  	Wrapper				 primitive
	 *  	Integer<------------ int
	 *      Double <------------ double
	 *      Float  <------------ float
	 *      Boolean<------------ boolean
	 *      Character <--------- char
	 */
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = 200;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1+n2);
		
		//Integer 최대값, 최소값, 바이트수, 사이즈
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		//문자열을 숫자로 변환
		System.out.println(Integer.parseInt("100") * 2);
		System.out.println(Double.parseDouble("3.1415")*2);
		System.out.println(Integer.toHexString(65));
		System.out.println(0x41); // 16진수를 표현할때 앞에 0x 
		System.out.println(011); //8진수를 표현할때 앞에 0 
		
		int i1 = 100;
		//auto boxing
		Integer i2 = i1;
		//auto unboxing
		int i3 = i2;
		System.out.println(i3);
		
		//1.5 이전 버전에서의 boxing, unboxing
		int i4 = 100;
		Integer i5 = new Integer(i4); //boxing
		int i6 = i5.intValue(); //unboxing
		System.out.println(i6);
		//---------------------
		Object o1=new Integer(1); 
		int i=((Integer)o1).intValue();
		System.out.println(i);
	}
}











