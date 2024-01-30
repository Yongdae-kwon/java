package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		
		// 작업 스레드 생성
		Thread thread = new Thread(new Runnable() {
		//Runnable ( ) 객체를 통해 스레드 작업 생성
			@Override
			public void run() {			// run 스레드 main ( )
				
				// 작업 스레드가 실행하는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5 ; i++) {
					toolkit.beep();				// 비프음 발생 (띵 소리)
					try { Thread.sleep(500); 	// 0.5초간 일시정지
					
					}catch (Exception e) { }
				}				
			}			
		});		
		thread.start();		 // 스레드 동작 시작
		
		
		//메인 스레드 가 실행하는 코드
		for (int i=0; i < 5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500); 			// 0.5 초간 일시정지
			
			}catch (Exception e) { }
		}
	}
}
//소리랑 띵 출력이 동시에 이루어짐