package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	
	public static void main(String[] args) {
		//Thred 자식 클래스로  스레드 생성 : extends 상속
		
		//작업스레드
			 Thread thread = new Thread() {
				@Override 		// 익명 자식 클래스 오버라이딩
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					for (int i=0; i<5; i++) {
						toolkit.beep();
						try {Thread.sleep(500);					
						}catch(Exception e) { }
					}
				}
			 };
			 thread.start();
			 
			 //메인 스레드가 실행하는 코드
			 for (int i=0; i<5; i++) {
				 System.out.println("띵");
				 try {Thread.sleep(500);		 
				 }catch(Exception e) { }
			 }
	}
}
