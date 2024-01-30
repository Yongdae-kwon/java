package ch14.sec08;

public class AutoSaveThread extends Thread{
	
	public void save () { 
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) { 	// 인터럽트 예외를 이용하여 인터럽트 유무 확인
				break;					// while 구문 빠져 나가기
			}
		save();
		}
	}
}


