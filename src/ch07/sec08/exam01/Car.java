package ch07.sec08.exam01;

public class Car {
	
	//필드 선언
	public Tire tire; // 객체 Tire 형을 가진 tire 필드 생성
	
	public void run() {   // Car 가 굴러가면
		tire.roll();      // tire가 roll 굴러가게 실행
	}

}
