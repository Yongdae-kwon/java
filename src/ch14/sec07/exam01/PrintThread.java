package ch14.sec07.exam01;

public class PrintThread extends Thread{
	
	// 필드
	private boolean stop;
	
	// 외부에서 stop 필드 값을 변경할 수 있도록 Setter 선언
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	@Override
	public void run() {
		
		//stop 필드 값에 따라 반복 여부 결정
		
		while (!stop) { 		// stop 이 true면 --> false 중지  stop이 false -- > true 실행
			System.out.println("실행 중");	 // stop 명령이 들어오기 전까지 계속 실행
		}
		System.out.println("리소스 정리");		// 먼저 리소스 정리가 일어나고
		System.out.println("실행 종료");		// 스레드 종료(안전한 종료)
	}
	//while 구문에서 stop 명령어 들어오기 전까지 스레드 실행
	// stop 명령어가 들어 오면 리소스 를 먼저 정리한 이후에 스레드가 종료 - 안전 종료
}
