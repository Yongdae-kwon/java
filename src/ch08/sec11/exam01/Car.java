package ch08.sec11.exam01;

public class Car {
	
	
	//필드 2개 생성 인터페이스 타입   :  자동 형변환
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	
	//메서드 
	void run() {
		tire1.roll();
		tire2.roll();		
	}
}
