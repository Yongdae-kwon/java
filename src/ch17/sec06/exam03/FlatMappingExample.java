package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {
		
		
		// 문장 스트림을 단어 스트림으로 변환  -- 하나의 문자를 여러 개의 단어로 분리  이후 스트림 형태로 저장
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream()
			.flatMap (data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		// 문자열 숫자 목록 스트림을 숫자 스트림으로 변환 
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
			.flatMapToInt(data -> { 
				String [] strArr = data.split(",");			// , 기준으로 전부 분리 10 20 30 40 50 분리
				int [] intArr = new int[strArr.length];		// intArr배열 길이는 5
				for (int i=0; i < strArr.length; i++) {				// 10 20 30 40 50 하나씩 가져와서
					intArr[i] = Integer.parseInt(strArr[i].trim()); // 문자 --> 숫자
				}
				return Arrays.stream(intArr);				// int [] 배열을 --> intStream 
			})
			.forEach(number -> System.out.println(number));
	}
}
