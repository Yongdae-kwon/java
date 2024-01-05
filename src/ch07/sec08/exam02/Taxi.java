package ch07.sec08.exam02;

public class Taxi extends Vehicle {

	//매서드 재정의 (오버라이딩 - Taxi)
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");	
	}
}
