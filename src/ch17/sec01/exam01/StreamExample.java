package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// Set 컬렉션 생성
		Set <String> set = new HashSet<>(); // 스트림 형태를 set에 담겠다
		// set 데이터 추가
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		// Stream을 이용한 요소 반복 처리
		Stream <String> stream = set.stream();	// set를 스트림으로 변환해서 스트림 형태로 담는다.
		stream.forEach(name -> System.out.println(name));
	}
}
