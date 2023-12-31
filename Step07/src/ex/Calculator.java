package ex;

/*
 * 	메서드 오버로딩
 * 		메서드 이름을 중복으로 쓸수 있게하는 방법
 * 		1. 매개변수 개수가 다르게 설정
 * 		2. 매개변수 개수가 같다면 타입이 다르면 됨
 */
public class Calculator {
	
	private int sumCount;
	private int minusCount;
	private int multipleCount;
	private int divCount;
	
	//정수 두개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	int sum(int n1, int n2) {
		sumCount++;
		return n1 + n2;
	}
	int minus(int n1, int n2) {
		minusCount++;
		return n1 - n2;
	}
	int multiple(int n1, int n2) {
		multipleCount++;
		return n1 * n2;
	}
	int div(int n1, int n2) {
		divCount++;
		return n1 / n2;
	}
	//실수 두개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	double sum(double n1, double n2) {
		sumCount++;
		return n1 + n2;
	}
	double minus(double n1, double n2) {
		minusCount++;
		return n1 - n2;
	}
	double multiple(double n1, double n2) {
		multipleCount++;
		return n1 * n2;
	}
	double div(double n1, double n2) {
		divCount++;
		return n1 / n2;
	}
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 큰 숫자를 리턴하는 메서드
	int max(int n1, int n2) {
		if(n1 > n2)
			return n1;
		return n2;
	}
	//숫자 두개를 매개변수로 받아서 두 숫자 중 작은 숫자를 리턴하는 메서드
	int min(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}
	
	/*
	 *	사칙연산을 수행 할때마다 각 연산별 실행 횟수를 저장
	 *	별도의 메서드를 통해서 사칙연산이 각각 몇 번 수행되었는지 출력
	 *	 
	 *	출력예시>
	 * 		덧셈 : 1, 뺄셈 : 2, 곱셈 : 0, 나눗셈 : 4
	 */
	public void printCount() {
		System.out.printf("덧셈 : %d, 뺄셈 : %d, 곱셈 : %d, 나눗셈 : %d",
				sumCount,minusCount,multipleCount,divCount);
	}
	
	/*
	 * 숫자 n이 소수면 true를 리턴, 아니면 false를 리턴하는 메서드를 작성
	 */ 
	public boolean checkPrimeNumber(int n) {
		if(n < 2) return false;
		for(int i=2;i<n;i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	//숫자를 여러개를 매개변수로 받아서, 매개변수로 받은 숫자들의 평균을 리턴 메서드를 작성
	//단 숫자는 몇개를 받을지 모름
	public double avgArray(int[] arr) {
		int sum = 0;
		for(int n : arr)
			sum += n;
		return (double)sum / arr.length;
	}
	
	//가변길이 매개변수
	public double avgArray2(int...arr) {
		int sum = 0;
		for(int n : arr)
			sum += n;
		return (double)sum / arr.length;
	}
	
}












