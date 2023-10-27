package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//작업영역
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(2);
		}catch(Exception e) {
			//try 영역에서 Exception(런타임 에러)가 발생 했을때 처리하는 영역
			//Exception이 발생하지 않으면 실행되지 않는다.
			System.out.println(3);
		}
		System.out.println(4);
	}

}








