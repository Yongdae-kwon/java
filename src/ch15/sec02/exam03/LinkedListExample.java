package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;		// 시작 시간
		long endTime;		// 종료 시간
							// 작업 시간 = 종료 시간 - 시작 시간
		
		//ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i=0 ; i <10000 ; i++) {
			list1.add(0,String.valueOf(i)); // 인덱스 0에 값을 삽입
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","ArrayList 걸린 시간 : ", (endTime-startTime));
		// 왼쪽 정렬 17  정수 8개 출력 ns 붙음
		
		//LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i=0 ; i <10000 ; i++) {
			list2.add(0,String.valueOf(i)); // LinkedList 에 인덱스 0에 값을 삽입
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","LinkedList 걸린 시간 : ", (endTime-startTime));
	}
}
