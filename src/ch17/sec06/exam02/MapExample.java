package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		
		int [] intArray = { 1 , 2 , 3 , 4 , 5 };
		
		IntStream intStream = Arrays.stream(intArray);  // 배열 (intArray)를 스트림형 (IntStream)으로 변환
		
		// 정수 -- > 실수  / IntStream 형 --> DoubleStream 형 - 스트림의 형 변환
		intStream
			.asDoubleStream()		// 형 변환 (참조타입 변환 아님):  Double 타입형태로 변환 
			.forEach(d -> System.out.println(d));   // 1.0 이런식으로 소수점 생김
		
		System.out.println();
		
		// 기본 타입 --> 참조 타입 변환
		intStream = Arrays.stream(intArray);  // 초기화 ?
		intStream
			.boxed()				// 기본 --> 참조 타입 래퍼 스트림으로 변환  int -> integer
			.forEach(obj -> System.out.println(obj));
	}
}
