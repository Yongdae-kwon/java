package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+ " 실행");
		
		for ( int i=0; i<3; i++) {
			Thread threadA = new Thread () { 	// 추가 작업 3번
				@Override
				public void run () {
					System.out.println(getName() + " 실행");
					// getName()의 메서드는 Thread의 인스턴스 메서드로 스레드의 이름을 리턴
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread () {
			@Override
			public void run () {
				System.out.println (getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start(); //작업 스레드 이름 변경
	}
}
