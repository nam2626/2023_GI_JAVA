package ex;

/*
 * 	메서드 오버로딩
 * 		메서드 이름을 중복으로 쓸수 있게하는 방법
 * 		1. 매개변수 개수가 다르게 설정
 * 		2. 매개변수 개수가 같다면 타입이 다르면 됨
 */
public class Calculator {
	
	//정수 두개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	int sum(int n1, int n2) {
		return n1 + n2;
	}
	int minus(int n1, int n2) {
		return n1 - n2;
	}
	int multiple(int n1, int n2) {
		return n1 * n2;
	}
	int div(int n1, int n2) {
		return n1 / n2;
	}
	//실수 두개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	double sum(double n1, double n2) {
		return n1 + n2;
	}
	double minus(double n1, double n2) {
		return n1 - n2;
	}
	double multiple(double n1, double n2) {
		return n1 * n2;
	}
	double div(double n1, double n2) {
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
}







