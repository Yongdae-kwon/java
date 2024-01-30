package ch14.sec03.exam01;

import java.awt.Toolkit;     // beep 을 생성

public class BeepPrintExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0 ; i < 5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); 
				} catch (Exception e) {}
		}
	
		for (int i = 0 ; i < 5; i++) {   
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}	
	}
}

// 소리 먼저 들리고 이후 띵 이 출력됨