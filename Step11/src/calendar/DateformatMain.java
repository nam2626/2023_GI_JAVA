package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateformatMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어 주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy");//연도 4자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy");//연도 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM");//월 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M");//월 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM");//로컬 형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM");//로컬 형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd");//일 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d");//일 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E");//요일
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEE");//요일 약자(영문은 3자리) --> 로컬형식, 한글 X
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE");//요일 영문 풀네임 --> 로컬형식
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("H");//시간 1자리 - 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH");//시간 2자리 - 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("h");//시간 1자리 - 12시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("hh");//시간 2자리 - 12시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("a");//오전/오후
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("m");//분 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");//분 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("s");//분 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");//분 2자리
		System.out.println(sdf.format(cal.getTime()));
		
		//2023-05-25 14:26:30
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		//2022년 12월 05일 12시 35분 55초
		sdf.applyPattern("yyyy년 MMM dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		//2023_05_25_14_26_30
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(cal.getTime()));

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MMM dd일 HH시 mm분 ss초", Locale.ENGLISH);
		System.out.println(sdf1.format(cal.getTime()));
	}		

}











