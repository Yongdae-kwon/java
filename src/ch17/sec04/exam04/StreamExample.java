package ch17.sec04.exam04;

import java.nio.charset.Charset;  	// 문자 인코딩 
import java.nio.file.Files;		  	// 파일 사용하겠다      io : 입출력
import java.nio.file.Path;			// 경로
import java.nio.file.Paths;			// 경로들
import java.util.stream.Stream;		// String 객체 - stream


public class StreamExample {

	public static void main(String[] args) throws Exception {
		
		//파일의 경로
		// StreamExample 파일이 있는 곳을 기준으로 data.txt 파일을 찾겟다.
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());

		// data.txt 파일을 한줄씩 Stream 으로 저장			 기본 캐릭터셋 : UTF - 8
		Stream <String> stream = Files.lines(path, Charset.defaultCharset()); 
		// 스트림을 한줄 단위 (파일을 한줄 단위로 출력)
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}
}
