package ch15.sec04.exam01;

import java.util.HashMap;	// 자식
import java.util.Iterator;	// set 데이터를 하나씩 
import java.util.Map;		// 부모
import java.util.Map.Entry;	// 키와 값으로 이루어진 형태 
import java.util.Set;		// map 데이터를 set에 넣어서 처리

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성 Sting : 키  , Integer : 값
		Map<String, Integer> map = new HashMap<>();
		
		//객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 키 중복 : 값을 변경 기존 홍길동, 90 --> 홍길동 , 95
		System.out.println("총 Entry 수 : " + map.size()); 		// 키가 다른 것은 3가지만 있다.
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key); // map - entry 안에서 키가 홍길동 인  엔트리의 값을 가져온다.
		System.out.println(key + ": " + map.get("홍길동"));
		System.out.println();
		
		// 키 Set 컬렉션을 얻고 , 반복해서 키와 값을 얻기
		// 키에 해당하는 부분을 Set으로 저장하고 Set 에 있는 것을 하나씩 map.get(set) 하나씩 대입해서 해당
		
		// 키에 해당하는 부분을 set으로 가져와서 map 있는 데이터를 출력
		Set<String> keySet = map.keySet(); // map 안에 있는 것을 key에 해당되는 부분만 가져온다.
 		Iterator<String> keyIterator = keySet.iterator();
 		
 		while(keyIterator.hasNext()) {
 			String k = keyIterator.next(); 	// 키의 값을 하나씩 가져와서 k로 저장
 			Integer v = map.get(k);
 			System.out.println(k + " : " + v);
 		}
 		System.out.println();
 		
 		//엔트리 Set 컬렉션을 얻고 , 반복해서 키와 값을 얻기
 		
 		//map의 엔트리 (키와 값을)를 set으로 가져와서 처리    위는 키로 가져왔다면 이건 키와 값을 가져와서 출력
 		
 		Set<Entry<String, Integer>> entrySet = map.entrySet(); // 담아줄 그릇 이름을 entrySet으로 지정
 		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
 		while (entryIterator.hasNext()) {			// 가져올 엔트리가 있다면
 			Entry<String, Integer> entry = entryIterator.next();	
 			// set 하나 값을 가져와서 엔트리 형태로 담는다.
 			String k = entry.getKey(); 		// 엔트리의 키를 가져온다.
 			Integer v = entry.getValue();	// 엔트리의 값을 가져온다.
 			System.out.println(k + " : " + v); 			
 		}
 		System.out.println();
 		
 		//키로 엔트리 삭제
 		map.remove("홍길동");
 		System.out.println("총 Entry 수 : " + map.size());
 		System.out.println();	 		
	}
}
