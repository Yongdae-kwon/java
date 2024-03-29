package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
 

public class EchoClient {

	public static void main(String[] args) {
		try {
			// Socket 생성과 동시에 localhost 의 50001 Port로 연결요청
			Socket socket = new Socket ("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			// 데이터 보내기
			String sendMessage = "나는 자바가 좋아~";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			// 데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
			
			
			// 연결 끊기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		}catch (UnknownHostException e) {
			// IP 표기 방법이 잘못되었을 경우
		}catch (IOException e)  {
			// 해당 포트의 서버에 연결할 수 없는 경우
		}
	}

}
