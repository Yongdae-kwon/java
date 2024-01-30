package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList 를 이용해서  Board 객체를 List에 담기
		List<Board> list = new ArrayList<>();  // List 자식이 ArrayList
		
		
		// 객체 추가 : Board 객체를 생성 하면서 list에 바로 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		//저장된 총 객체 수 얻기
		int size = list.size();  // list 안에 담기  자료수를 리턴
		System.out.println("총 객체 수: " + size); //size 이용해서 총 몇건의 자료가 있나 확인
		System.out.println("");		
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2); // 인덱스 2번에 해당하는 객체를 가져와서 객체에 담기
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" +
							board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기 : 모든 것들을 가져와서 하니씩 대입해서 처리
		for (int i=0; i <list.size(); i++) {	 
			Board b = list.get(i);				// 처음 부터 끝까지 하나씩 객체로 대입해서 처리
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" +
							b.getWriter());
		}
		System.out.println();
		
		for (int i=list.size()-1; i >=0; i--) {	 
			Board b = list.get(i);				// 처음 부터 끝까지 하나씩 객체로 대입해서 처리
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" +
							b.getWriter());
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);		// 인덱스 2번에 있는 객체 삭제  3--> 2 , 4 --> 3 , 5-->4 .......
		list.remove(2);		// 인덱스 2번에 있는 객체 삭제
		
		//향상된 for 문으로 모든 객체를 하나씩 가져오기
		// 
		for (Board b : list) { 		// list에 있는 객체를 하나씩 Board b 객체에 담아서 처리
									// 저장된 순번대로
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" +
					b.getWriter());		
		}
	}
}
