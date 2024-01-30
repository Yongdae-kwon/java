package ch08.sec10.exam02;

public class Bus implements Vehicle {

	// run 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");		
	}
	
	//추가 메서드
	public void checkFare() {  // 버스에서만 가능
		System.out.println("승차요금을 체크합니다.");
	}
}
