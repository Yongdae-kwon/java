package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss"); // a는 오전 오후 구분
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");  // E 는 요일
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");  // D는 월 구분이 없는 일 (1~365)
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");  // 월에서 구분되는 일 
		System.out.println(sdf.format(now));
	}
}
