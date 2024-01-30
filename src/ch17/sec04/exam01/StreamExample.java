package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// List 컬렉션 생성
		List <Product> list = new ArrayList<>(); 		//List를 담아줄건데 Product의 객체 형태로?
		for (int i=0; i<=5 ; i++) { // 5번 실행
			Product product = new Product (i, "상품"+i,"멋진 회사",
								(int)(10000*Math.random())); // double 형태로 나오므로 int로 강제변환
															 
			list.add(product);			// product 객체를 List에 추가
		}
		
		// 객체 스트림 얻기
		Stream <Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p)); // 스트림에서 객체 하나 꺼내어서 (p)출력 (toString형태)한다.
	}
}
