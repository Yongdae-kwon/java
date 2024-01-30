package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {


		//	List 컬렉션 생성
		List <Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동",30));
		studentList.add(new Student("신용권",10));
		studentList.add(new Student("유미선",20));
		
		// 점수를 기준으로 오름 차순으로 정렬한 새 스트림 얻기
		studentList.stream()
				.sorted((s1, s2) -> Integer.compare(s1.getScore(),s2.getScore()))
				.forEach(s -> System.out.println(s.getName() +": " + s.getScore()));
		System.out.println();					//30 10 20 이 있는데 30 10 비교해서 자리바뀌고 10 30 20
												//10 30 20 에서 20 30 비교해서 자리바뀌고 10 20 30
		
		// 점수를 기준으로 내림 차순으로 정렬한 새 스트림 얻기
		studentList.stream()
				.sorted((s1,s2) -> Integer.compare(s2.getScore(), s1.getScore()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));				
	}
}
