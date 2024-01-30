package ch14.sec07.exam03;

public class PrintThread extends Thread{
	
	public void run() {
		
		while(true) {
			System.out.println("실행 중");	
			
			// interrupt ( ) 메서드가 호출되었다면 while 문을 빠져나감
			if (Thread.interrupted()) {		//인터럽트 유무 확인 (true 일때 실행)
				break;		
			
			}
		} 
	
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
