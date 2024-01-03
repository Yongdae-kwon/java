package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null; // Week enum 형태 today 변수 선언
		
		Calendar cal = Calendar.getInstance(); // 컴퓨터 날짜 및 시간 정보 객체
		
		int week = cal.get(Calendar.DAY_OF_WEEK);//요일정보를 숫자로 가져오기
		                                         // 일(1)~ 토(7)
		
		switch(week) {    // 숫자를 열거 상수로 변환해서 변수에 대입
		   case 1: today = Week.SUNDAY;   break;
		   case 2: today = Week.MONDAY;   break;
		   case 3: today = Week.TUESDAY;   break;
		   case 4: today = Week.WEDNESDAY;   break;  //4일 경우 today에 WEDNESDAY 값을 대입
		   case 5: today = Week.THURSDAY;   break;
		   case 6: today = Week.FRIDAY;   break;
		   case 7: today = Week.SATURDAY;   break;
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바를 공부합니다");
		}
	}
}
