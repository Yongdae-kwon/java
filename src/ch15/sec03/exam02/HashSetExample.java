package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
	
		//HashSet 컬렉션 저장
		Set<Member> set = new HashSet<Member>();// Set 객체 생성
		
		//Member 객체 저장
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",40));
		set.add(new Member("홍길동",40));
		
		
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
	}
}
