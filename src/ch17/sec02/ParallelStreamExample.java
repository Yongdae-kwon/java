package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		// List 컬렉션 생성
		List <String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬 처리
		Stream <String> parallelStream = list.parallelStream();  // 리스트를 병렬 스트림에 담아줌
		parallelStream.forEach( name -> {
			System.out.println(name+ ": " + Thread.currentThread().getName()); 
			// currentThread - 현재 구동하는 스레드
			
			
			
		});
	}
}

//결과값이 여러개 다양하게 나올건데 각각 어느 스레드에서 동작하는지 보여주는거