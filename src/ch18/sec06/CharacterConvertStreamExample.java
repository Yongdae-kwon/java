package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {	// 예외 -> main -> os
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{	// 예외 -> main
		
		// FileOutputStream 에 OutputStreamWriter 보조 스트림을 연결
		OutputStream os = new FileOutputStream ("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter (os,"UTF-8");  // 출력  --> byte --> char 출력 : UTF-8
		
		// OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		
		// FileInputStream 에 InputStreamReader 보조 스트림을 연결
		InputStream is = new FileInputStream ("C:/Temp/test.txt");	// char 로 저장했으므로 read 이용
		Reader reader = new InputStreamReader (is,"UTF-8"); // InputStream 을 reader 형태로
		
		// InputStreamReader 보조 스트림을 이용해서 문자 입력
		char [] data = new char[100]; 	// data 를 배열로 넣을려고
		int num =reader.read(data); 	
		reader.close();
		
		// char 배열에서 읽은 문자 수만큼 문자열로 변환
		String str = new String(data,0,num);			
		return str;
	}
}
