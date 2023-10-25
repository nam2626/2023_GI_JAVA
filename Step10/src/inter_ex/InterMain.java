package inter_ex;

public class InterMain {

	public static void main(String[] args) {
		InterClass inter = new InterClass();
		inter.interA();
		
		//인터페이스도 변수 타입으로 선언이 가능, 단 직접적인 생성 X
		InterA interA = inter;
		interA.interA();
		
		System.out.println(inter.circleArea(3));
	}

}
