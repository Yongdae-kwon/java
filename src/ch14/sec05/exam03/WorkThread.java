package ch14.sec05.exam03;

public class WorkThread extends Thread {
	
	//필드
	public boolean work = true;
	
	//생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	//메서드
	@Override
	public void run () {
		while(true) {		
			if(work) {				//true 이면 정상적인 스레드
				System.out.println(getName()+ ": 작업 처리");
			}else {
				Thread.yield();		// false 이면 다른 스레드에게 작업 양보 
									// 다른 스레드가 더 많이 실행
			}
		}
	}
}
