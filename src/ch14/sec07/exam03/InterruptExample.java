package ch14.sec07.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		
		// 스레드 실행 일정 시간 지난 다음에 인터럽트 발생해서 스레드 종료
		Thread thread = new PrintThread();   
		thread.start();
		
		try {
			Thread.sleep(1000);			
		}catch(InterruptedException e) { }
				
		thread.interrupt();		// 인터럽트는 실행한다고 안하고 걸어둔다. 라고 표현함
	}
}
