package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		
		//FileReader 에 BufferedReader  보조스트림 연결
		BufferedReader br = new BufferedReader (
			new FileReader ("src/ch18/sec07/exam02/ReadLineExample.java")
		);
		
		int lineNo = 1 ;
		while (true) {
			String str = br.readLine();	 // 1행을 읽음  // readLine( ) - 파일에서 1행씩 읽음
			
			// 더 이상 읽을 내용이 없으면 while 문 종료 
			if (str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		// BufferedReader 를 닫으면 연결된 FileReader 도 닫힘
		br.close();
	}
}
