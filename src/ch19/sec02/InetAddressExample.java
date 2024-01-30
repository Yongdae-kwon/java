package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;	// 알 수 없는 주소에 대한 예외

public class InetAddressExample {

	public static void main(String[] args) {
		
		try {
			// localhost : 자신의 ip
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
				
			InetAddress [] iaArr = InetAddress.getAllByName("www.naver.com");
			// AllByName 이라 여러개 가져오므로 배열로 담음
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
			}
			
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}	
	}
}
