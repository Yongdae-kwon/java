package ch14.sec06.exam01;

public class User2Thread extends Thread {
	
	// user1 에서는 동기화된 memory 값을 100
	private Calculator calculator;
		
		public User2Thread() {
			setName("User2Thread"); // 스레드 이름 변경
		}
		
		// 외부에서 공유 객체인 Calculator를 받아 필드를 저장 
		public void setCalculator(Calculator calculator) {
			this.calculator = calculator;
		}
		
		// 동기화 블록을 가진 메서드 호출
		@Override
		public void run () {
			calculator.setMemory2(50);
		}
}
