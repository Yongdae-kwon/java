package ch14.sec06.exam01;

public class Calculator {
	
	//필드
	private int memory;
	
	//메서드
	public int getMemory() { return memory; }
	
	//동기화 작업이 일어나면 동기화 작업에 관련된 필드의 값을 변경 할 수 있다.
	
	// 동기화 메서드
	public synchronized void setMemory1(int memory) { //메모리 값을 변경 시 동기화
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) { }
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	// 동기화 블록이 있는 메서드
	public void setMemory2(int memory) { 			
		synchronized(this) {			// 동기화 블록
		this.memory = memory;			// 
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) { }
		System.out.println(Thread.currentThread().getName() + " :" + this.memory);
		}
	}

	
}