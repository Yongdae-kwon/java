package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		
		int [] intArr = { 1 , 2 , 3 , 4 , 5 };
		
		//잘못 작성한 경우
		Arrays.stream(intArr) 			// intArr 배열을 스트림 배열 형태로 변환
			.filter(a -> a%2==0)		// 2의 배수만 남게하는 필터 
			.peek(n -> System.out.println(n)); // 실행해도 값이 아무것도 안나온다.
											   // peek : 중간처리이기 때문에 뒤에 최종처리문이 있어야한다.
		
		// 중간 처리 메서드 peek( ) 을 이용해서 반복 처리
		int total = Arrays.stream (intArr)
				.filter(a -> a%2 ==0)
				.peek(n -> System.out.println(n))
				.sum(); 	// sum ( ) 합계 : 최종 처리문 역할
		System.out.println("총합 : " + total +"\n");
		
		// 최종 처리 메서드 forEach( ) 를 이용해서 반복 처리
		Arrays.stream(intArr)
			.filter(a -> a%2 ==0)
			.forEach( n -> System.out.println(n));
	}
}
