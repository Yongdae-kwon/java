package ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// 일시정지 상태 (sleep ();  )
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<10; i++) {
			toolkit.beep();
		try { 
			Thread.sleep(3000);		 // 3초 일시정지 상태
		}catch(InterruptedException e) { }
		}
	}
}
//Main : 하나의 스레드
