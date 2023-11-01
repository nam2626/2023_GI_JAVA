package lamda;

public class LamdaEx3 {

	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		m1.run("Hello");
		// 정수 - 제곱의 결과 출력
		Method<Integer> m2 = (a) -> System.out.println(a * a);
		m2.run(2);
		// 실수 - 원넓이 결과 출력
		Method<Double> m3 = (r) -> System.out.println(r * r * Math.PI);
		m3.run(5.0);
		
	}

}
