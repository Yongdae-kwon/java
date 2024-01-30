package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi ();
		
		//매개 값으로 구현 객체 대입 (다형성 : 실행 결과가 다름)
		driver.drive(bus);   // drive 메서드에 bus 넣고 실행
		driver.drive(taxi);  // drive 메서드에 taxi 넣고 실행
	}
}
