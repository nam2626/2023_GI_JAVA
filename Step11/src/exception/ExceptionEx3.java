package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5 / 0);
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		} finally {
			//반드시 실행되는 영역
			System.out.println(4);
		}
		System.out.println("end");
	}

}
