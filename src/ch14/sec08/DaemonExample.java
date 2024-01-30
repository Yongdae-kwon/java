package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//AutoSaveThread를 데몬 스레드로 만듦
		autoSaveThread.setDaemon(true);		// 데몬 스레드 : Main 종료되면 데몬도 종료
		autoSaveThread.start();
		
		try { 
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("메인 스레드 종료");
	}
}
//Main 스레드 종료 되기 전까지 Daemon 스레드도 작업이 진행이 되고 있다가 
//Main 스레드가 종료될 시점에 인터럽트가 실행되면서 Daemon 스레드 작업이 먼저 종료가 되고
//Main 스레드가 종료된다.