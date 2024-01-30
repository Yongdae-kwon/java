package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer extends Thread {
	
	// 스레드에서 생성할거다. 데이터그램 소켓
	private static DatagramSocket datagramSocket = null;

	public static void main(String[] args) throws Exception {
		
		System.out.println("------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter  키를 입력하세요.");
		System.out.println("------------------------------------------------");
		
		// UDP 서버 시작
		startServer ();
		
		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}			
		}
		scanner.close();
		
		// TCP 서버종료
		stopServer ();
	}
	
	// 데이터그램 소캣 객체 생성
	public static void startServer() {		
		// 작업 스레드 정의
		Thread thread = new Thread ( ) {
			@Override
			public void run() {
				try { 
					// DatagramSocket 객체 생성 : 포트
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");
					
					//패킷 주고 받기
					while (true) {
						// 클라이언트가 구독하고 싶은 뉴스 주제 얻기   - 데이터 그램 패킷 (byte [] , 크기 지정) 생성
						DatagramPacket receivePacket = new DatagramPacket (new byte[1024],1024);
						datagramSocket.receive(receivePacket);
						String newsKind = 
								new String(receivePacket.getData(), 0 , receivePacket.getLength() , "UTF-8");
					
					// 클라이언트의 IP와 Port 얻기
					SocketAddress socketAddress = receivePacket.getSocketAddress();
					
					// 10개의 뉴스를 클라이언트로 전송 // 데이터  그램 발신 (송신) 패킷
					for(int i = 1; i <=10 ; i++) {
						String data = newsKind + ": 뉴스" + i;		//보낼 데이터 생성
						byte [] bytes = data.getBytes("UTF-8");		// 보낼 데이터를 배열에 담기
						DatagramPacket sendPacket =
								new DatagramPacket(bytes , 0 , bytes.length, socketAddress);
						datagramSocket.send(sendPacket);
					}
				}
				}catch (Exception e) {
						System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		// 스레드 시작
		thread.start();		
	}
	
	public static void stopServer() {
		// DatagreamSocket을 닫고 Port 언바인딩
		datagramSocket.close();
		System.out.println("[서버] 종료됨");			
	}
}
