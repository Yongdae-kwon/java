package ch17.sec04.exam02;

// 배열을 스트림으로 받아서 처리하는 방법

import java.util.Arrays;
import java.util.stream.IntStream; // 정수형 스트림
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// 배열 생성 	 String -- > Stream<String>     String은 객체  : 객체 처리
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);	
				// strArray 를 가져와서 스트림 형태로 strStream에 담아주겠다
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		
		
		// 숫자 형태 배열 	int -- > IntStream   int는 객체가 아니라 타입이다. 타입이므로 타입에 알맞게 IntStream으로 담아준다
		int [] intArray = { 1 , 2 , 3 , 4 , 5 };
		IntStream intStream = Arrays.stream(intArray);	 	// intStream
		intStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
	}
}
