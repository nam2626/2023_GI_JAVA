package calendar;

import java.sql.Date;
import java.util.Calendar;

public class DDay {
	/*
	 * 오늘 날짜 기준으로 수능까지 몇일 남았는지 출력
	 * getTime, 밀리초(1000이면 1초)
	 * 
	 */
	public static void main(String[] args) {
		Date today = new Date(123, 9, 26);
		Date sooday = new Date(123, 10, 16);
		
		System.out.println((sooday.getTime() - today.getTime()) /(1000 * 60 * 60 * 24));
		
		Calendar t = Calendar.getInstance();
		Calendar s = Calendar.getInstance();
		s.set(2023, 10, 16);
		System.out.println(s.get(Calendar.DAY_OF_YEAR) - t.get(Calendar.DAY_OF_YEAR));
	}

}









