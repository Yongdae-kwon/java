package ch14.sec06.exam02;

public class WorkObject {
	
	//동기화 메서드
	public synchronized void methodA () {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify (); 		// 다른 스레드를 실행 대기 상태로 만들기
		try { 
			wait();		// 자신은 일시 정지 상태로 만들기 (Waiting Pool)
		}catch (InterruptedException e) { }
		
	}
	// 주의할점 : notify  다른 스레드를 먼저 실행 대기 만든 다음에 자신이 wait가 되어야한다.
	
	// 동기화 메서드
	public synchronized void methodB () {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify (); 		// 다른 스레드를 실행 대기 상태로 만들기
		try { 
			wait();		// 자신은 일시 정지 상태로 만들기 (Waiting Pool)
		}catch (InterruptedException e) { }
		
		
	}
}
