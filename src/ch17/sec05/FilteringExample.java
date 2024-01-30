package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List <String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권"); 		// list 는 중복 허용
		list.add("신민철");  
		
		// 중복요소 제거		// 파이프라인을 이용해서 중간처리
		list.stream()					// list를 스트림으로 만들고
			.distinct()					// 스트림 요소들의 중복을 제거
			.forEach(n -> System.out.println(n) );	 //  스트림의 요소를 하나씩 가져와서 바로 출력
		System.out.println();
		
		// 필터링 : 신 으로 시작하는 요소만 필터링
		list.stream()
			.filter(n -> n.startsWith("신"))			// 요소의 시작 값이 "신" 인것만 True 필터링 된다.
			.forEach(n -> System.out.println(n) );	//
		System.out.println();
		
		// 중복 요소를 먼저 제거하고, 신 으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n) );
	}
}
