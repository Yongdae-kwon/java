package ch18.sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream ("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");			 		// 줄 안띄우고 출력
		ps.println("프린터가 출력하는 것처럼");		// 줄 띄우고 출력
		ps.println("데이터를 출력합니다.");
		ps.printf("| %6d | %-10s | %10s |\n",1,"홍길동","도적");  // 정수 - 10s  10칸 왼쪽 정렬 +면 오른쪽 정렬
		ps.printf("| %6d | %-10s | %10s |\n",2,"감자바","학생");
		
		// %-10s - 10칸에서 왼쪽 정렬 / %10s - 10칸에서 오른쪽 정렬  / \n 줄바꿈  / %6d 정수 취급
		ps.flush();
		ps.close();
	}
}
