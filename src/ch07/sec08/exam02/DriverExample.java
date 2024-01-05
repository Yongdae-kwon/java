package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//버스 객체 생성
		Bus bus = new Bus();
		driver.drive(bus);
		//위와 아래 결과값은 동일
		driver.drive (new Bus());
		
		//택시 객체 생성
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive (new Taxi());
	}
}
