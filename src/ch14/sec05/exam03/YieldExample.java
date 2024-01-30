package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workTheadA");
		WorkThread workThreadB = new WorkThread("workTheadB");
		workThreadA.start();
		workThreadB.start();
		
		// 처음에는 Thread A 와 Thread B 번갈아가면서 동작
		try { Thread.sleep(5000);
		}catch (InterruptedException e) { }
		workThreadA.work = false;		// 5초 뒤에  ThreadA를 false : 다른 스레드에 양보
		
		try { Thread.sleep(10000);
		}catch (InterruptedException e) { }
		workThreadA.work = true;		// 10초 뒤에 ThreadA를 true : 정상적 동작 다시 번갈아가면서 동작
	}
}
