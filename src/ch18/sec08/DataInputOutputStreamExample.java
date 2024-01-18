package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		// DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream ("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream (fos);
		
		// 기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble (95.5);
		dos.writeInt(1);
		dos.writeInt(20);
		
		dos.writeUTF("감자바");
		dos.writeDouble (90.3);
		dos.writeInt(2);
		dos.writeInt(30);
		
		dos.flush(); dos.close(); fos.close();
		
		// DataInputStream 생성  저장된 데이터 읽어와서 바로 사용하기
		FileInputStream fis = new FileInputStream ("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		// 기본타입 출력
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			int dd = dis.readInt();
			System.out.println(name + " : " + score + " : " + order + " : " + dd);
		} 

		dis.close(); fis.close();
	}
}
