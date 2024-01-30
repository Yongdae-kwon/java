package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {

	public static int sum; //  정적 int sum   -- 모든 곳에서 사용가능 
	public static int sum1;
	
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1,100);	// 1~100까지의 범위 값이 IntStream 안에 담아지게 된다.
		stream.forEach( a -> sum +=a); 		// 1~100까지의 값이 sum에 누적 된다.
		System.out.println("총합 : " + sum);
		
		IntStream stream1 = IntStream.range(1,100);	// range이면 끝수를 포함안함
		stream1.forEach( a -> sum1 +=a); 		// 1~99까지의 값이 sum에 누적 된다.
		System.out.println("총합 : " + sum1);
	}
}
