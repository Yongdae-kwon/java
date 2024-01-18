package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class ReadExample {

	public static void main(String[] args) {
		
		try {
			// 데이터 출발지를 test1.db로 하는 입력 스트림 생성 
			InputStream is = new FileInputStream("C:/Temp/test1.db"); // 1 Byte 입력
			
			while(true) {
				int data = is.read();  		// 1 byte 씩 읽기
				if(data == -1) break; 		// -1 의미?  파일의 끝에 도달하면 -1  EOF - end of file
				System.out.println(data);
			}
			
			is.close();						//	 입력스트림을 닫고 사용 메모리 해제
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
