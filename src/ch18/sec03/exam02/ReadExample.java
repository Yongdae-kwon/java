package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try {
			// 데이터 출발지를 test2.db로 하는 입력 스트림 생성
			InputStream is = new FileInputStream ("C:/Temp/test2.db");
			
			byte [] data = new byte [100];
			
			while (true) {
				int num = is.read(data);		// is에 있는 파일을 읽어와서 data 배열에 넣는다.
											    // 최대 100byte를 읽고 읽은 바이트는 data 저장, 읽은 수는 리턴
				if (num == -1)break;			// 파일 끝에 도달했을 경우 
												// 더이상 읽을 데이터가 없으면 -1 확인해서 나간다.
				
				for (int i =0; i<num; i++) {		// 읽은 바이트를 출력
					System.out.println(data[i]);
				}
			}
			is.close();							// 입력 스트림 닫기 (파일 닫기) , 배열의 모든 바이트를 출력
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
