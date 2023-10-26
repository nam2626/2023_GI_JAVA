package calendar;

import java.util.Calendar;

public class DateQuest {

	public static void main(String[] args) {
		//오늘 날짜 기준으로 택배가 영업일 기준 4일이 소모됨(오늘날짜 포함)
		//택배가 도착할 날짜를 계산해서 출력

		Calendar today = Calendar.getInstance();
		
		if(today.get(Calendar.DAY_OF_WEEK) + 3 > 5)
			today.set(Calendar.DATE, today.get(Calendar.DATE)+5);
		else
			today.set(Calendar.DATE, today.get(Calendar.DATE)+3);
		System.out.println(today.getTime());
		
	}

}
