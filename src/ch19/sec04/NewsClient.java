package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


public class NewsClient {

	public static void main(String[] args) {


		try {
			// DatagreamSocket 생성 : 포토 자동 할당
			DatagramSocket datagramSocket = new DatagramSocket();
			
			// 구독하는 뉴스 주체 전송
			String data = "정치";
			byte [] bytes =data.getBytes("UTF-8");  // 인코딩해서 배열로 보내줌
			DatagramPacket sendPacket = new DatagramPacket (
					bytes, 0 , bytes.length, new InetSocketAddress("localhost", 50001)); 
			// 소켓을 이용하여 패킷 전송
			datagramSocket.send(sendPacket);
			
			// 뉴스 받기
			while(true) {
				// 받는 것에 대한 패킷 생성
				DatagramPacket receivePacket = new DatagramPacket (new byte [1024],1024);
				// datagramSocket을 통해서 패킷을 받는다
				datagramSocket.receive(receivePacket);  
			
				// 받은 패킷을 문자열 변환   - 받는 데이터 , 범위설정 (0~크기길이만큼) , 인코딩할 종류?
				String news = new String (receivePacket.getData(), 0 , receivePacket.getLength() , "UTF-8");
				System.out.println(news);
				
				// 10번째 뉴스를 받으면 while문 종료
				if (news.contains("뉴스10")) {
					break;
				}
			}
			
			// DatagramSocket 닫기
			datagramSocket.close();			
		}catch(Exception e ) { // 모든 부분에 대한 ?
		}
	}
}
