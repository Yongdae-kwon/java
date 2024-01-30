package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();   // 자동 형변환
		
		vehicle.run ();
		//vehicle.checkFare();          // vehicle 인터페이스 에서는 checkFare 메서드가 없다.
		
		Bus bus = (Bus) vehicle;       // 강제 형변환 대입이 가능
		
		bus.run();
		bus.checkFare();               // 강제 형변환으로 구현객체가 가진 메서드 (checkFare) 실행
	}
}
