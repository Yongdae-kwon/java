package ch14.sec06.exam01;

public class User1Thread extends Thread {
	
	// user1 에서는 동기화된 memory 값을 100
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread"); // 스레드 이름 변경
	}
	
	// 외부에서 공유 객체인 Calculator를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// 동기화 메서드 호출
	@Override
	public void run () {
		calculator.setMemory1(100);
	}

}
