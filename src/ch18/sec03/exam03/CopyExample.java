package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args)throws Exception {
		
		// 파일 복사
		
		String originalFileName =  "C:/Temp/test.jpg";	// 원본 파일 불러오기
		String targetFileName = "C:/Temp/test1.jpg"; 	// 파일 복사
		
		// 입출력 스트림 생성
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		// 배열을 이용해서 파일 복사
		byte [] data = new byte [1024];  	// 1024 byte --> 1Mb
											// 읽은 바이트를 저장할 배열 생성
		
		while (true) {
			int num = is.read(data); 		// 원본 파일을 배열로 읽어 오기 
											// 최대 1024 바이트를 읽고 배열에 저장 ,읽은 바이트는 리턴
			if (num == -1)break;			// 파일을 다 읽으면 while 문 종료
			os.write(data,0,num);			// 읽은 바이트 수만큼 출력
		}
		
		os.flush();		// 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
