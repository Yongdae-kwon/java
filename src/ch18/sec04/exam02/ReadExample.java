package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
				
		try { 
			Reader reader = null;
			
			// 1 문자씩 읽기
			reader = new FileReader("C:/Temp/test.txt");	// 텍스트 파일로부터 문자 입력스트림 생성
			while(true) {
				int data = reader.read(); 		// 1 문자 (char) 읽음
				if(data == -1) break;			// 파일을 다 읽으면 while 문 종료
				System.out.print((char)data);	// 읽은 문자 출력 - (char) 아스키코드인걸 문자로 변환
			}
			reader.close();
			System.out.println();
			
			// 문자 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt"); 	// 텍스트 파일로부터 문자 입력스트림 생성
			char [] data = new char [100];			// 읽은 문자를 저장할 배열 생성
			while(true) {		
				int num = reader.read(data);		// 읽은 문자는 배열에 저장 ,읽은 문자 수는 리턴
				if (num == -1) break;				// 파일을 다 읽으면 while 문 종료
				// 읽은 문자 수만큼 출력
				for (int i=0; i<num; i++) {		
					System.out.print(data[i]);
				}
			}
			reader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
